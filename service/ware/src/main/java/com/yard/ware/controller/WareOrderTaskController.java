package com.yard.ware.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.ware.entity.WareOrderTaskEntity;
import com.yard.ware.service.WareOrderTaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 库存工作单
 */
@RestController
@AllArgsConstructor
@RequestMapping("ware/wareordertask")
public class WareOrderTaskController {

    private final WareOrderTaskService wareOrderTaskService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = wareOrderTaskService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        WareOrderTaskEntity wareOrderTask = wareOrderTaskService.getById(id);

        return R.ok().put("wareOrderTask", wareOrderTask);
    }

    @RequestMapping("/save")
    public R save(@RequestBody WareOrderTaskEntity wareOrderTask) {
        wareOrderTaskService.save(wareOrderTask);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody WareOrderTaskEntity wareOrderTask) {
        wareOrderTaskService.updateById(wareOrderTask);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        wareOrderTaskService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
