package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.SpuCommentEntity;
import com.yard.service.SpuCommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品评价
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/spucomment")
public class SpuCommentController {

    private final SpuCommentService spuCommentService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuCommentService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SpuCommentEntity spuComment = spuCommentService.getById(id);

        return R.ok().put("spuComment", spuComment);
    }

    @RequestMapping("/save")
    public R save(@RequestBody SpuCommentEntity spuComment) {
        spuCommentService.save(spuComment);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody SpuCommentEntity spuComment) {
        spuCommentService.updateById(spuComment);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        spuCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
