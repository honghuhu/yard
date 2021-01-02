package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.GrowthChangeHistoryEntity;
import com.yard.service.GrowthChangeHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 成长值变化历史记录
 */
@RestController
@AllArgsConstructor
@RequestMapping("member/growthchangehistory")
public class GrowthChangeHistoryController {

    private final GrowthChangeHistoryService growthChangeHistoryService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = growthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

        return R.ok().put("growthChangeHistory", growthChangeHistory);
    }

    @RequestMapping("/save")
    public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory) {
        growthChangeHistoryService.save(growthChangeHistory);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory) {
        growthChangeHistoryService.updateById(growthChangeHistory);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
