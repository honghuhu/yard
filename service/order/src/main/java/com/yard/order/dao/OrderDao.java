package com.yard.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:09:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
