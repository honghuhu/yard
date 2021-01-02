package com.yard.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.member.entity.MemberStatisticsInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员统计信息
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:02:29
 */
@Mapper
public interface MemberStatisticsInfoDao extends BaseMapper<MemberStatisticsInfoEntity> {

}
