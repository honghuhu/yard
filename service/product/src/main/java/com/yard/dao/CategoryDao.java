package com.yard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 08:34:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
