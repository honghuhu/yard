package com.yard.member.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.member.entity.MemberReceiveAddressEntity;
import com.yard.member.service.MemberReceiveAddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员收货地址
 */
@RestController
@AllArgsConstructor
@RequestMapping("member/memberreceiveaddress")
public class MemberReceiveAddressController {

    private final MemberReceiveAddressService memberReceiveAddressService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberReceiveAddressService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberReceiveAddressEntity memberReceiveAddress = memberReceiveAddressService.getById(id);

        return R.ok().put("memberReceiveAddress", memberReceiveAddress);
    }

    @RequestMapping("/save")
    public R save(@RequestBody MemberReceiveAddressEntity memberReceiveAddress) {
        memberReceiveAddressService.save(memberReceiveAddress);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody MemberReceiveAddressEntity memberReceiveAddress) {
        memberReceiveAddressService.updateById(memberReceiveAddress);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberReceiveAddressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
