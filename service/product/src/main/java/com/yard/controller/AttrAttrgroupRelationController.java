package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.AttrAttrgroupRelationEntity;
import com.yard.service.AttrAttrgroupRelationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 属性&属性分组关联
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/attrattrgrouprelation")
public class AttrAttrgroupRelationController {

    private final AttrAttrgroupRelationService attrAttrgroupRelationService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = attrAttrgroupRelationService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        AttrAttrgroupRelationEntity attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

        return R.ok().put("attrAttrgroupRelation", attrAttrgroupRelation);
    }

    @RequestMapping("/save")
    public R save(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
        attrAttrgroupRelationService.save(attrAttrgroupRelation);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
        attrAttrgroupRelationService.updateById(attrAttrgroupRelation);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
