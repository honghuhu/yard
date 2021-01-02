package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.CouponHistoryEntity;
import com.yard.service.CouponHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 优惠券领取历史记录
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/couponhistory")
public class CouponHistoryController {

    private final CouponHistoryService couponHistoryService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        CouponHistoryEntity couponHistory = couponHistoryService.getById(id);

        return R.ok().put("couponHistory", couponHistory);
    }

    @RequestMapping("/save")
    public R save(@RequestBody CouponHistoryEntity couponHistory) {
        couponHistoryService.save(couponHistory);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody CouponHistoryEntity couponHistory) {
        couponHistoryService.updateById(couponHistory);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        couponHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
