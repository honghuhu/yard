package com.yard.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

