package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.SkuLadderEntity;
import com.yard.service.SkuLadderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品阶梯价格
 */
@RestController
@AllArgsConstructor
@RequestMapping("coupon/skuladder")
public class SkuLadderController {

    private final SkuLadderService skuLadderService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = skuLadderService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SkuLadderEntity skuLadder = skuLadderService.getById(id);

        return R.ok().put("skuLadder", skuLadder);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SkuLadderEntity skuLadder) {
        skuLadderService.save(skuLadder);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SkuLadderEntity skuLadder) {
        skuLadderService.updateById(skuLadder);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        skuLadderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
