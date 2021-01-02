package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.ProductAttrValueEntity;
import com.yard.service.ProductAttrValueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * spu属性值
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/productattrvalue")
public class ProductAttrValueController {

    private final ProductAttrValueService productAttrValueService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = productAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        ProductAttrValueEntity productAttrValue = productAttrValueService.getById(id);

        return R.ok().put("productAttrValue", productAttrValue);
    }

    @RequestMapping("/save")
    public R save(@RequestBody ProductAttrValueEntity productAttrValue) {
        productAttrValueService.save(productAttrValue);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody ProductAttrValueEntity productAttrValue) {
        productAttrValueService.updateById(productAttrValue);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        productAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
