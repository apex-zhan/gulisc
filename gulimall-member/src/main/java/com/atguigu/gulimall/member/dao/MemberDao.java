package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author zxw
 * @email zxw@gmail.com
 * @date 2024-05-03 01:41:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
