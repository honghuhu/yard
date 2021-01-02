package com.yard.ware.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.ware.entity.WareOrderTaskDetailEntity;
import com.yard.ware.service.WareOrderTaskDetailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 库存工作单
 */
@RestController
@AllArgsConstructor
@RequestMapping("ware/wareordertaskdetail")
public class WareOrderTaskDetailController {

    private final WareOrderTaskDetailService wareOrderTaskDetailService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = wareOrderTaskDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        WareOrderTaskDetailEntity wareOrderTaskDetail = wareOrderTaskDetailService.getById(id);

        return R.ok().put("wareOrderTaskDetail", wareOrderTaskDetail);
    }

    @RequestMapping("/save")
    public R save(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail) {
        wareOrderTaskDetailService.save(wareOrderTaskDetail);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail) {
        wareOrderTaskDetailService.updateById(wareOrderTaskDetail);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        wareOrderTaskDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
