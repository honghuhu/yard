package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.IntegrationChangeHistoryEntity;
import com.yard.service.IntegrationChangeHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 积分变化历史记录
 */
@RestController
@AllArgsConstructor
@RequestMapping("member/integrationchangehistory")
public class IntegrationChangeHistoryController {

    private final IntegrationChangeHistoryService integrationChangeHistoryService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = integrationChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        IntegrationChangeHistoryEntity integrationChangeHistory = integrationChangeHistoryService.getById(id);

        return R.ok().put("integrationChangeHistory", integrationChangeHistory);
    }

    @RequestMapping("/save")
    public R save(@RequestBody IntegrationChangeHistoryEntity integrationChangeHistory) {
        integrationChangeHistoryService.save(integrationChangeHistory);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody IntegrationChangeHistoryEntity integrationChangeHistory) {
        integrationChangeHistoryService.updateById(integrationChangeHistory);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        integrationChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
