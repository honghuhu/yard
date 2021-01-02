package com.yard.coupon.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.coupon.entity.CouponSpuCategoryRelationEntity;
import com.yard.coupon.service.CouponSpuCategoryRelationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 优惠券分类关联
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/couponspucategoryrelation")
public class CouponSpuCategoryRelationController {

    private final CouponSpuCategoryRelationService couponSpuCategoryRelationService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponSpuCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        CouponSpuCategoryRelationEntity couponSpuCategoryRelation = couponSpuCategoryRelationService.getById(id);

        return R.ok().put("couponSpuCategoryRelation", couponSpuCategoryRelation);
    }

    @RequestMapping("/save")
    public R save(@RequestBody CouponSpuCategoryRelationEntity couponSpuCategoryRelation) {
        couponSpuCategoryRelationService.save(couponSpuCategoryRelation);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody CouponSpuCategoryRelationEntity couponSpuCategoryRelation) {
        couponSpuCategoryRelationService.updateById(couponSpuCategoryRelation);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        couponSpuCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
