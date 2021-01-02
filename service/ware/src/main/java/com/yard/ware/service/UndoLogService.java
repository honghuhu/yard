package com.yard.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 *
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

