package com.yard.product.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.product.entity.SpuInfoEntity;
import com.yard.product.service.SpuInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * spu信息
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/spuinfo")
public class SpuInfoController {

    private final SpuInfoService spuInfoService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SpuInfoEntity spuInfo = spuInfoService.getById(id);

        return R.ok().put("spuInfo", spuInfo);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SpuInfoEntity spuInfo) {
        spuInfoService.save(spuInfo);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SpuInfoEntity spuInfo) {
        spuInfoService.updateById(spuInfo);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        spuInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
