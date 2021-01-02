package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.MemberLoginLogEntity;
import com.yard.service.MemberLoginLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员登录记录
 */
@RestController
@AllArgsConstructor
@RequestMapping("member/memberloginlog")
public class MemberLoginLogController {

    private final MemberLoginLogService memberLoginLogService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberLoginLogEntity memberLoginLog = memberLoginLogService.getById(id);

        return R.ok().put("memberLoginLog", memberLoginLog);
    }

    @RequestMapping("/save")
    public R save(@RequestBody MemberLoginLogEntity memberLoginLog) {
        memberLoginLogService.save(memberLoginLog);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody MemberLoginLogEntity memberLoginLog) {
        memberLoginLogService.updateById(memberLoginLog);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberLoginLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
