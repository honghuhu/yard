package com.yard.product.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.product.entity.CommentReplayEntity;
import com.yard.product.service.CommentReplayService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品评价回复关系
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/commentreplay")
public class CommentReplayController {

    private final CommentReplayService commentReplayService;


    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = commentReplayService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        CommentReplayEntity commentReplay = commentReplayService.getById(id);

        return R.ok().put("commentReplay", commentReplay);
    }

    @RequestMapping("/save")
    public R save(@RequestBody CommentReplayEntity commentReplay) {
        commentReplayService.save(commentReplay);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody CommentReplayEntity commentReplay) {
        commentReplayService.updateById(commentReplay);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        commentReplayService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
