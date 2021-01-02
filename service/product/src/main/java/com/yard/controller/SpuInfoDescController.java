package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.SpuInfoDescEntity;
import com.yard.service.SpuInfoDescService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * spu信息介绍
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/spuinfodesc")
public class SpuInfoDescController {

    private final SpuInfoDescService spuInfoDescService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuInfoDescService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{spuId}")
    public R info(@PathVariable("spuId") Long spuId) {
        SpuInfoDescEntity spuInfoDesc = spuInfoDescService.getById(spuId);

        return R.ok().put("spuInfoDesc", spuInfoDesc);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SpuInfoDescEntity spuInfoDesc) {
        spuInfoDescService.save(spuInfoDesc);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SpuInfoDescEntity spuInfoDesc) {
        spuInfoDescService.updateById(spuInfoDesc);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] spuIds) {
        spuInfoDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
