package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.OrderOperateHistoryEntity;
import com.yard.service.OrderOperateHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 订单操作历史记录
 */
@RestController
@AllArgsConstructor
@RequestMapping("order/orderoperatehistory")
public class OrderOperateHistoryController {

    private final OrderOperateHistoryService orderOperateHistoryService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderOperateHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        OrderOperateHistoryEntity orderOperateHistory = orderOperateHistoryService.getById(id);

        return R.ok().put("orderOperateHistory", orderOperateHistory);
    }

    @RequestMapping("/save")
    public R save(@RequestBody OrderOperateHistoryEntity orderOperateHistory) {
        orderOperateHistoryService.save(orderOperateHistory);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody OrderOperateHistoryEntity orderOperateHistory) {
        orderOperateHistoryService.updateById(orderOperateHistory);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        orderOperateHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
