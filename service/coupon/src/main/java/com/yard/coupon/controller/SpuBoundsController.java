package com.yard.coupon.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.coupon.entity.SpuBoundsEntity;
import com.yard.coupon.service.SpuBoundsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品spu积分设置
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/spubounds")
public class SpuBoundsController {

    private final SpuBoundsService spuBoundsService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SpuBoundsEntity spuBounds = spuBoundsService.getById(id);

        return R.ok().put("spuBounds", spuBounds);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SpuBoundsEntity spuBounds) {
        spuBoundsService.save(spuBounds);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SpuBoundsEntity spuBounds) {
        spuBoundsService.updateById(spuBounds);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        spuBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
