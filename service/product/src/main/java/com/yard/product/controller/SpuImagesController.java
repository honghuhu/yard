package com.yard.product.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.product.entity.SpuImagesEntity;
import com.yard.product.service.SpuImagesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * spu图片
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/spuimages")
public class SpuImagesController {

    private final SpuImagesService spuImagesService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SpuImagesEntity spuImages = spuImagesService.getById(id);

        return R.ok().put("spuImages", spuImages);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SpuImagesEntity spuImages) {
        spuImagesService.save(spuImages);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SpuImagesEntity spuImages) {
        spuImagesService.updateById(spuImages);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        spuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
