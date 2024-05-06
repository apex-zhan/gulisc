package com.atguigu.gulimall.gulimallproduct;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {


    @Resource
    BrandService brandService;
    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("zxw");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("zxw");
        //添加操作
//        brandService.save(brandEntity);
//        System.out.println("保存成功到。。。");

        //修改操作
//        brandService.updateById(brandEntity);

        //查询操作
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(System.out::println);

    }

}
