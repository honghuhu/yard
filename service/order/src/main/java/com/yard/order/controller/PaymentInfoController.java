package com.yard.order.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.order.entity.PaymentInfoEntity;
import com.yard.order.service.PaymentInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 支付信息表
 */
@RestController
@AllArgsConstructor
@RequestMapping("order/paymentinfo")
public class PaymentInfoController {

    private final PaymentInfoService paymentInfoService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = paymentInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        PaymentInfoEntity paymentInfo = paymentInfoService.getById(id);

        return R.ok().put("paymentInfo", paymentInfo);
    }

    @RequestMapping("/save")
    public R save(@RequestBody PaymentInfoEntity paymentInfo) {
        paymentInfoService.save(paymentInfo);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody PaymentInfoEntity paymentInfo) {
        paymentInfoService.updateById(paymentInfo);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        paymentInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
