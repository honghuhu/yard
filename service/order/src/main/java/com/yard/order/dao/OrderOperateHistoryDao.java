package com.yard.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.order.entity.OrderOperateHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:09:35
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {

}
