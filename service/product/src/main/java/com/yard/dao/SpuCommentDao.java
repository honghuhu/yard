package com.yard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.entity.SpuCommentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 08:34:50
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {

}
