package com.yard.common.utils.filter;

import com.alibaba.fastjson.JSON;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 全局Filter，统一处理会员登录与外部不允许访问的服务
 * </p>
 */
@Component
public class AuthGlobalFilter implements GlobalFilter, Ordered {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    public static void main(String[] args) {
        byte[] bits = JSON.toJSONString(new HashMap<String, Object>(3) {{
            put("code", -1);
            put("msg", "鉴权失败");
        }}).getBytes(StandardCharsets.UTF_8);
        byte[] bits2 = JSON.toJSONBytes(new HashMap<String, Object>(3) {{
            put("code", -1);
            put("msg", "鉴权失败");
        }});
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        //007学院api接口，校验用户必须登录
        if (antPathMatcher.match("/api/**/auth/**", path)) {
            List<String> tokenList = request.getHeaders().get("token");
            if (null == tokenList) {
                ServerHttpResponse response = exchange.getResponse();
                return out(response);
            } else {
//                Boolean isCheck = JwtUtils.checkToken(tokenList.get(0));
//                if(!isCheck) {
                ServerHttpResponse response = exchange.getResponse();
                return out(response);
//                }
            }
        }
        // 内部服务接口，不允许外部访问
        if (antPathMatcher.match("/**/inner/**", path)) {
            ServerHttpResponse response = exchange.getResponse();
            return out(response);
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }

    private Mono<Void> out(ServerHttpResponse response) {
        byte[] bits = JSON.toJSONBytes(new HashMap<String, Object>(3) {{
            put("code", -1);
            put("msg", "鉴权失败");
        }});
        DataBuffer buffer = response.bufferFactory().wrap(bits);
        // response.setStatusCode(HttpStatus.UNAUTHORIZED);
        // 指定编码，否则在浏览器中会中文乱码
        response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
        return response.writeWith(Mono.just(buffer));
    }
}
