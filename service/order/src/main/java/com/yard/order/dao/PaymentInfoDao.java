package com.yard.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.order.entity.PaymentInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:09:35
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}
