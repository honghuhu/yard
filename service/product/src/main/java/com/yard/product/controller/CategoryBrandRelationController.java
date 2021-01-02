package com.yard.product.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.product.entity.CategoryBrandRelationEntity;
import com.yard.product.service.CategoryBrandRelationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 品牌分类关联
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/categorybrandrelation")
public class CategoryBrandRelationController {

    private final CategoryBrandRelationService categoryBrandRelationService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = categoryBrandRelationService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        CategoryBrandRelationEntity categoryBrandRelation = categoryBrandRelationService.getById(id);

        return R.ok().put("categoryBrandRelation", categoryBrandRelation);
    }

    @RequestMapping("/save")
    public R save(@RequestBody CategoryBrandRelationEntity categoryBrandRelation) {
        categoryBrandRelationService.save(categoryBrandRelation);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody CategoryBrandRelationEntity categoryBrandRelation) {
        categoryBrandRelationService.updateById(categoryBrandRelation);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        categoryBrandRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
