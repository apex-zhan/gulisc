package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author zxw
 * @email zxw@gmail.com
 * @date 2024-05-03 15:56:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
