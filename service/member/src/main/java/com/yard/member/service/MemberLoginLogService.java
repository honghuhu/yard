package com.yard.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yard.common.core.utils.PageUtils;
import com.yard.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
*/
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

