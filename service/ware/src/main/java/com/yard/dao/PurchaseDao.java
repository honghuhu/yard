package com.yard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:11:58
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {

}
