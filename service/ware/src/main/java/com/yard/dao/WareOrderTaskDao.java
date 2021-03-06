package com.yard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yard.entity.WareOrderTaskEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 *
 * @author dofar
 * @email yxuiang@gmail.com
 * @date 2021-01-02 12:11:58
 */
@Mapper
public interface WareOrderTaskDao extends BaseMapper<WareOrderTaskEntity> {

}
