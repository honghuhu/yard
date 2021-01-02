package com.yard.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.member.entity.MemberReceiveAddressEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收货地址
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:02:29
 */
@Mapper
public interface MemberReceiveAddressDao extends BaseMapper<MemberReceiveAddressEntity> {

}
