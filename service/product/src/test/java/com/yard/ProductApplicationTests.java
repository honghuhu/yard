package com.yard;

import com.yard.entity.BrandEntity;
import com.yard.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    public void Save() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("xiaomi");
        brandEntity.setLogo("xiaomi.logo");
        brandEntity.setDescript("xiaomi.desc");
        brandService.save(brandEntity);
    }

}
