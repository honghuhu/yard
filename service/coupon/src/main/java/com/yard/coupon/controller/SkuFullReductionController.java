package com.yard.coupon.controller;

import com.yard.common.utils.PageUtils;
import com.yard.common.utils.R;
import com.yard.coupon.entity.SkuFullReductionEntity;
import com.yard.coupon.service.SkuFullReductionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品满减信息
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 11:54:18
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/skufullreduction")
public class SkuFullReductionController {

    private SkuFullReductionService skuFullReductionService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = skuFullReductionService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SkuFullReductionEntity skuFullReduction = skuFullReductionService.getById(id);

        return R.ok().put("skuFullReduction", skuFullReduction);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SkuFullReductionEntity skuFullReduction) {
        skuFullReductionService.save(skuFullReduction);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SkuFullReductionEntity skuFullReduction) {
        skuFullReductionService.updateById(skuFullReduction);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        skuFullReductionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
