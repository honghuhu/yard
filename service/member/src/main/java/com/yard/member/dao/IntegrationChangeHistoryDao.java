package com.yard.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.member.entity.IntegrationChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:02:29
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {

}
