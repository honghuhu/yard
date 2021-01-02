package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.SeckillSkuRelationEntity;
import com.yard.service.SeckillSkuRelationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 秒杀活动商品关联
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/seckillskurelation")
public class SeckillSkuRelationController {

    private final SeckillSkuRelationService seckillSkuRelationService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = seckillSkuRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SeckillSkuRelationEntity seckillSkuRelation = seckillSkuRelationService.getById(id);

        return R.ok().put("seckillSkuRelation", seckillSkuRelation);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SeckillSkuRelationEntity seckillSkuRelation) {
        seckillSkuRelationService.save(seckillSkuRelation);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SeckillSkuRelationEntity seckillSkuRelation) {
        seckillSkuRelationService.updateById(seckillSkuRelation);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        seckillSkuRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
