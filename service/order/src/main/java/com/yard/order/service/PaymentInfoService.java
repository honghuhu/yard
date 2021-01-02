package com.yard.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
*/
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

