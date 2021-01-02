package com.yard.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.coupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 11:54:18
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
