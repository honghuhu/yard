package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.HomeSubjectSpuEntity;
import com.yard.service.HomeSubjectSpuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 专题商品
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/homesubjectspu")
public class HomeSubjectSpuController {

    private final HomeSubjectSpuService homeSubjectSpuService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = homeSubjectSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        HomeSubjectSpuEntity homeSubjectSpu = homeSubjectSpuService.getById(id);

        return R.ok().put("homeSubjectSpu", homeSubjectSpu);
    }

    @RequestMapping("/save")
    public R save(@RequestBody HomeSubjectSpuEntity homeSubjectSpu) {
        homeSubjectSpuService.save(homeSubjectSpu);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody HomeSubjectSpuEntity homeSubjectSpu) {
        homeSubjectSpuService.updateById(homeSubjectSpu);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        homeSubjectSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
