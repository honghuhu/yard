package com.yard.member.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.member.entity.MemberLevelEntity;
import com.yard.member.service.MemberLevelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员等级
 */
@RestController
@AllArgsConstructor
@RequestMapping("member/memberlevel")
public class MemberLevelController {

    private final MemberLevelService memberLevelService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberLevelService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberLevelEntity memberLevel = memberLevelService.getById(id);

        return R.ok().put("memberLevel", memberLevel);
    }

    @RequestMapping("/save")
    public R save(@RequestBody MemberLevelEntity memberLevel) {
        memberLevelService.save(memberLevel);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody MemberLevelEntity memberLevel) {
        memberLevelService.updateById(memberLevel);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberLevelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
