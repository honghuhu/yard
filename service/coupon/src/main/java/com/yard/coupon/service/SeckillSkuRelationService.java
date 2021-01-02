package com.yard.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

