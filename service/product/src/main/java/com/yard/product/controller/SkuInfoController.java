package com.yard.product.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.product.entity.SkuInfoEntity;
import com.yard.product.service.SkuInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * sku信息
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/skuinfo")
public class SkuInfoController {

    private final SkuInfoService skuInfoService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = skuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{skuId}")
    public R info(@PathVariable("skuId") Long skuId) {
        SkuInfoEntity skuInfo = skuInfoService.getById(skuId);

        return R.ok().put("skuInfo", skuInfo);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SkuInfoEntity skuInfo) {
        skuInfoService.save(skuInfo);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SkuInfoEntity skuInfo) {
        skuInfoService.updateById(skuInfo);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] skuIds) {
        skuInfoService.removeByIds(Arrays.asList(skuIds));

        return R.ok();
    }

}
