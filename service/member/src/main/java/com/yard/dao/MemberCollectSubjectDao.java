package com.yard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.entity.MemberCollectSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的专题活动
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:02:29
 */
@Mapper
public interface MemberCollectSubjectDao extends BaseMapper<MemberCollectSubjectEntity> {

}
