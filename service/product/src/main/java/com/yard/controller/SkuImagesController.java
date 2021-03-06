package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.SkuImagesEntity;
import com.yard.service.SkuImagesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * sku图片
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/skuimages")
public class SkuImagesController {

    private final SkuImagesService skuImagesService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = skuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SkuImagesEntity skuImages = skuImagesService.getById(id);

        return R.ok().put("skuImages", skuImages);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SkuImagesEntity skuImages) {
        skuImagesService.save(skuImages);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SkuImagesEntity skuImages) {
        skuImagesService.updateById(skuImages);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        skuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
