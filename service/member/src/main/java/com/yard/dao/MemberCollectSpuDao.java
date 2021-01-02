package com.yard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.entity.MemberCollectSpuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的商品
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:02:29
 */
@Mapper
public interface MemberCollectSpuDao extends BaseMapper<MemberCollectSpuEntity> {

}
