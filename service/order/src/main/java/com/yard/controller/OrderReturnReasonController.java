package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.OrderReturnReasonEntity;
import com.yard.service.OrderReturnReasonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 退货原因
 */
@RestController
@AllArgsConstructor
@RequestMapping("order/orderreturnreason")
public class OrderReturnReasonController {

    private final OrderReturnReasonService orderReturnReasonService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderReturnReasonService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        OrderReturnReasonEntity orderReturnReason = orderReturnReasonService.getById(id);

        return R.ok().put("orderReturnReason", orderReturnReason);
    }

    @RequestMapping("/save")
    public R save(@RequestBody OrderReturnReasonEntity orderReturnReason) {
        orderReturnReasonService.save(orderReturnReason);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody OrderReturnReasonEntity orderReturnReason) {
        orderReturnReasonService.updateById(orderReturnReason);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        orderReturnReasonService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
