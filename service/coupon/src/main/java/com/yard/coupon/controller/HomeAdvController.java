package com.yard.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yard.coupon.entity.HomeAdvEntity;
import com.yard.coupon.service.HomeAdvService;
import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import lombok.AllArgsConstructor;


/**
 * 首页轮播广告
*/
@RestController
@AllArgsConstructor
@RequestMapping("coupon/homeadv")
public class HomeAdvController {

    private final HomeAdvService homeAdvService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeAdvService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeAdvEntity homeAdv = homeAdvService.getById(id);

        return R.ok().put("homeAdv", homeAdv);
    }

    @RequestMapping("/save")
    public R save(@RequestBody HomeAdvEntity homeAdv){
		homeAdvService.save(homeAdv);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody HomeAdvEntity homeAdv){
		homeAdvService.updateById(homeAdv);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeAdvService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
