package com.yard.coupon.controller;

import com.yard.common.utils.PageUtils;
import com.yard.common.utils.R;
import com.yard.coupon.entity.SeckillSessionEntity;
import com.yard.coupon.service.SeckillSessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 秒杀活动场次
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 11:54:18
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/seckillsession")
public class SeckillSessionController {

    private SeckillSessionService seckillSessionService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = seckillSessionService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SeckillSessionEntity seckillSession = seckillSessionService.getById(id);

        return R.ok().put("seckillSession", seckillSession);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SeckillSessionEntity seckillSession) {
        seckillSessionService.save(seckillSession);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SeckillSessionEntity seckillSession) {
        seckillSessionService.updateById(seckillSession);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        seckillSessionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
