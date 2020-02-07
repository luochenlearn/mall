package com.learn.mall.user.service;

import com.learn.mall.user.bean.UmsMember;
import com.learn.mall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Author 20992
 * @Date 2020/2/7
 */
public interface UserService  {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
