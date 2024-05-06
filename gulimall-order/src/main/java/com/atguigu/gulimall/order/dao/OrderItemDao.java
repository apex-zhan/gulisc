package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author zxw
 * @email zxw@gmail.com
 * @date 2024-05-03 15:56:47
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
