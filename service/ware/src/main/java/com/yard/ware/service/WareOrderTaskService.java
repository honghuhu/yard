package com.yard.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
*/
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

