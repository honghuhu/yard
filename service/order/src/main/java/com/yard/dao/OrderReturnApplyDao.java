package com.yard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.entity.OrderReturnApplyEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:09:35
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {

}
