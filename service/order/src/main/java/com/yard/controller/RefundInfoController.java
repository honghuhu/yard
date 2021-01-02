package com.yard.controller;

import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.R;
import com.yard.entity.RefundInfoEntity;
import com.yard.service.RefundInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 退款信息
 */
@RestController
@AllArgsConstructor
@RequestMapping("order/refundinfo")
public class RefundInfoController {

    private final RefundInfoService refundInfoService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = refundInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        RefundInfoEntity refundInfo = refundInfoService.getById(id);

        return R.ok().put("refundInfo", refundInfo);
    }

    @RequestMapping("/save")
    public R save(@RequestBody RefundInfoEntity refundInfo) {
        refundInfoService.save(refundInfo);

        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody RefundInfoEntity refundInfo) {
        refundInfoService.updateById(refundInfo);

        return R.ok();
    }

    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        refundInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
