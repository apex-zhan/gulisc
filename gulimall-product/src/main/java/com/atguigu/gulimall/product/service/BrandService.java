package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.BrandEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌
 *
 * @author zxw
 * @email sunlightcs@gmail.com
 * @date 2024-04-28 20:36:05
 */

public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

