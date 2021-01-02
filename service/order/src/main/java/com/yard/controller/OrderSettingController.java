package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.OrderSettingEntity;
import com.yard.service.OrderSettingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 订单配置信息
 */
@RestController
@AllArgsConstructor
@RequestMapping("order/ordersetting")
public class OrderSettingController {

    private final OrderSettingService orderSettingService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderSettingService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        OrderSettingEntity orderSetting = orderSettingService.getById(id);

        return R.ok().put("orderSetting", orderSetting);
    }

    @RequestMapping("/save")
    public R save(@RequestBody OrderSettingEntity orderSetting) {
        orderSettingService.save(orderSetting);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody OrderSettingEntity orderSetting) {
        orderSettingService.updateById(orderSetting);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        orderSettingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
