package com.yard.ware.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.ware.entity.UndoLogEntity;
import com.yard.ware.service.UndoLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 *
 */
@RestController
@AllArgsConstructor
@RequestMapping("ware/undolog")
public class UndoLogController {

    private final UndoLogService undoLogService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = undoLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        UndoLogEntity undoLog = undoLogService.getById(id);

        return R.ok().put("undoLog", undoLog);
    }

    @RequestMapping("/save")
    public R save(@RequestBody UndoLogEntity undoLog) {
        undoLogService.save(undoLog);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody UndoLogEntity undoLog) {
        undoLogService.updateById(undoLog);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        undoLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
