package com.yard.coupon.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.coupon.entity.SeckillPromotionEntity;
import com.yard.coupon.service.SeckillPromotionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 秒杀活动
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/seckillpromotion")
public class SeckillPromotionController {

    private final SeckillPromotionService seckillPromotionService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = seckillPromotionService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SeckillPromotionEntity seckillPromotion = seckillPromotionService.getById(id);

        return R.ok().put("seckillPromotion", seckillPromotion);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SeckillPromotionEntity seckillPromotion) {
        seckillPromotionService.save(seckillPromotion);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SeckillPromotionEntity seckillPromotion) {
        seckillPromotionService.updateById(seckillPromotion);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        seckillPromotionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
