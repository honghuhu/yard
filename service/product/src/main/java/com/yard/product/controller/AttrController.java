package com.yard.product.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.product.entity.AttrEntity;
import com.yard.product.service.AttrService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品属性
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/attr")
public class AttrController {

    private final AttrService attrService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = attrService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{attrId}")
    public R info(@PathVariable("attrId") Long attrId) {
        AttrEntity attr = attrService.getById(attrId);

        return R.ok().put("attr", attr);
    }

    @RequestMapping("/save")
    public R save(@RequestBody AttrEntity attr) {
        attrService.save(attr);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody AttrEntity attr) {
        attrService.updateById(attr);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] attrIds) {
        attrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
