package com.yard.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:09:35
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

}
