package com.yard.member.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.member.entity.MemberCollectSubjectEntity;
import com.yard.member.service.MemberCollectSubjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员收藏的专题活动
 */
@RestController
@AllArgsConstructor
@RequestMapping("member/membercollectsubject")
public class MemberCollectSubjectController {

    private final MemberCollectSubjectService memberCollectSubjectService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberCollectSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberCollectSubjectEntity memberCollectSubject = memberCollectSubjectService.getById(id);

        return R.ok().put("memberCollectSubject", memberCollectSubject);
    }

    @RequestMapping("/save")
    public R save(@RequestBody MemberCollectSubjectEntity memberCollectSubject) {
        memberCollectSubjectService.save(memberCollectSubject);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody MemberCollectSubjectEntity memberCollectSubject) {
        memberCollectSubjectService.updateById(memberCollectSubject);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberCollectSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
