package com.yard.coupon.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.coupon.entity.CouponSpuRelationEntity;
import com.yard.coupon.service.CouponSpuRelationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 优惠券与产品关联
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/couponspurelation")
public class CouponSpuRelationController {

    private final CouponSpuRelationService couponSpuRelationService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponSpuRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        CouponSpuRelationEntity couponSpuRelation = couponSpuRelationService.getById(id);

        return R.ok().put("couponSpuRelation", couponSpuRelation);
    }

    @RequestMapping("/save")
    public R save(@RequestBody CouponSpuRelationEntity couponSpuRelation) {
        couponSpuRelationService.save(couponSpuRelation);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody CouponSpuRelationEntity couponSpuRelation) {
        couponSpuRelationService.updateById(couponSpuRelation);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        couponSpuRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
