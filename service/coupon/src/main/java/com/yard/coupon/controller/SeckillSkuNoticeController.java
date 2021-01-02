package com.yard.coupon.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.coupon.entity.SeckillSkuNoticeEntity;
import com.yard.coupon.service.SeckillSkuNoticeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 秒杀商品通知订阅
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/seckillskunotice")
public class SeckillSkuNoticeController {

    private final SeckillSkuNoticeService seckillSkuNoticeService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = seckillSkuNoticeService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SeckillSkuNoticeEntity seckillSkuNotice = seckillSkuNoticeService.getById(id);

        return R.ok().put("seckillSkuNotice", seckillSkuNotice);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice) {
        seckillSkuNoticeService.save(seckillSkuNotice);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice) {
        seckillSkuNoticeService.updateById(seckillSkuNotice);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        seckillSkuNoticeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
