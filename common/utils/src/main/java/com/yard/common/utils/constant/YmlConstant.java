package com.yard.common.utils.constant;

import lombok.Getter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YmlConstant {

    private static Coupon couple;

    public static Coupon getCouple() {
        return couple;
    }

    @Getter
    @Configuration
    public class Coupon implements InitializingBean {

        @Value("${spring.datasource.testurl:#{null}}")
        private String url;

        @Override
        public void afterPropertiesSet() {
            couple = this;
        }
    }
}
