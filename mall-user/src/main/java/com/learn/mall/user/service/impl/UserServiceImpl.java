package com.learn.mall.user.service.impl;

import com.learn.mall.user.bean.UmsMember;
import com.learn.mall.user.bean.UmsMemberReceiveAddress;
import com.learn.mall.user.mapper.UmsMemberReceiveAddressMapper;
import com.learn.mall.user.mapper.UserMapper;
import com.learn.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 20992
 * @Date 2020/2/7
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAll();//userMapper.selectAllUser();

        return umsMemberList;
    }

    /**
     * 根据用户id查询该用户收货地址的集合
     * @param memberId
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        //封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        //List<UmsMemberReceiveAddress> umsMemberReceiveAddressMappers = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

//        Example example = new Example(UmsMemberReceiveAddress.class);
//        example.createCriteria().andEqualTo("memberId",memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);

        return umsMemberReceiveAddresses;
    }
}
