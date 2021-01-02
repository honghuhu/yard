package com.yard.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:11:58
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

}
