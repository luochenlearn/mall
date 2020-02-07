package com.learn.mall.user.mapper;

import com.learn.mall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author 20992
 * @Date 2020/2/7
 */
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
