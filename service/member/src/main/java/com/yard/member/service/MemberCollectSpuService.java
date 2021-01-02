package com.yard.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
*/
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

