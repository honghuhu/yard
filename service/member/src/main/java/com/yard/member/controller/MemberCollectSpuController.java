package com.yard.member.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.member.entity.MemberCollectSpuEntity;
import com.yard.member.service.MemberCollectSpuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员收藏的商品
 */
@RestController
@AllArgsConstructor
@RequestMapping("member/membercollectspu")
public class MemberCollectSpuController {

    private final MemberCollectSpuService memberCollectSpuService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberCollectSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberCollectSpuEntity memberCollectSpu = memberCollectSpuService.getById(id);

        return R.ok().put("memberCollectSpu", memberCollectSpu);
    }

    @RequestMapping("/save")
    public R save(@RequestBody MemberCollectSpuEntity memberCollectSpu) {
        memberCollectSpuService.save(memberCollectSpu);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody MemberCollectSpuEntity memberCollectSpu) {
        memberCollectSpuService.updateById(memberCollectSpu);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberCollectSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
