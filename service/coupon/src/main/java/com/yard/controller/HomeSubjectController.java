package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.HomeSubjectEntity;
import com.yard.service.HomeSubjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/homesubject")
public class HomeSubjectController {

    private final HomeSubjectService homeSubjectService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = homeSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        HomeSubjectEntity homeSubject = homeSubjectService.getById(id);

        return R.ok().put("homeSubject", homeSubject);
    }

    @RequestMapping("/save")
    public R save(@RequestBody HomeSubjectEntity homeSubject) {
        homeSubjectService.save(homeSubject);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody HomeSubjectEntity homeSubject) {
        homeSubjectService.updateById(homeSubject);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        homeSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
