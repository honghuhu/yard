package com.yard.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.yard.common.core.utils.PageUtils;
import com.yard.entity.CategoryEntity;
import com.yard.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 商品三级分类
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/category")
public class CategoryController {

    private final CategoryService categoryService;

    @RequestMapping("tree")
    public R<List<CategoryEntity>> tree() {
        List<CategoryEntity> treeCategory = categoryService.tree();

        return R.ok(treeCategory);
    }

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = categoryService.queryPage(params);

        return R.ok(page);
    }

    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok(category);
    }

    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);

        return R.ok(null);
    }

    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);

        return R.ok(null);
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok(null);
    }

}
