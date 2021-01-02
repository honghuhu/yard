package com.yard.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yard.common.core.utils.PageUtils;
import com.yard.common.core.utils.Query;
import com.yard.product.dao.SkuImagesDao;
import com.yard.product.entity.SkuImagesEntity;
import com.yard.product.service.SkuImagesService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImagesEntity> page = this.page(
                new Query<SkuImagesEntity>().getPage(params),
                new QueryWrapper<SkuImagesEntity>()
        );

        return new PageUtils(page);
    }

}