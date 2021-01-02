package com.yard.member.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.member.entity.MemberStatisticsInfoEntity;
import com.yard.member.service.MemberStatisticsInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员统计信息
 */
@RestController
@AllArgsConstructor
@RequestMapping("member/memberstatisticsinfo")
public class MemberStatisticsInfoController {

    private final MemberStatisticsInfoService memberStatisticsInfoService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberStatisticsInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberStatisticsInfoEntity memberStatisticsInfo = memberStatisticsInfoService.getById(id);

        return R.ok().put("memberStatisticsInfo", memberStatisticsInfo);
    }

    @RequestMapping("/save")
    public R save(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo) {
        memberStatisticsInfoService.save(memberStatisticsInfo);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo) {
        memberStatisticsInfoService.updateById(memberStatisticsInfo);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberStatisticsInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
