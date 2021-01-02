package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.OrderReturnApplyEntity;
import com.yard.service.OrderReturnApplyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 订单退货申请
 */
@RestController
@AllArgsConstructor
@RequestMapping("order/orderreturnapply")
public class OrderReturnApplyController {

    private final OrderReturnApplyService orderReturnApplyService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderReturnApplyService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        OrderReturnApplyEntity orderReturnApply = orderReturnApplyService.getById(id);

        return R.ok().put("orderReturnApply", orderReturnApply);
    }

    @RequestMapping("/save")
    public R save(@RequestBody OrderReturnApplyEntity orderReturnApply) {
        orderReturnApplyService.save(orderReturnApply);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody OrderReturnApplyEntity orderReturnApply) {
        orderReturnApplyService.updateById(orderReturnApply);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        orderReturnApplyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
