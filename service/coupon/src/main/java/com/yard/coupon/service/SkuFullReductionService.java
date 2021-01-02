package com.yard.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

