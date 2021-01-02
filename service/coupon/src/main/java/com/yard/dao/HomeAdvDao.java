package com.yard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.entity.HomeAdvEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页轮播广告
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 11:54:18
 */
@Mapper
public interface HomeAdvDao extends BaseMapper<HomeAdvEntity> {

}
