package com.yard.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

