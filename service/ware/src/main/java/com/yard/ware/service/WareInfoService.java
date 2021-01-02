package com.yard.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

