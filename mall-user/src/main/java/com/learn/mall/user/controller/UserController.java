package com.learn.mall.user.controller;

import com.learn.mall.user.bean.UmsMember;
import com.learn.mall.user.bean.UmsMemberReceiveAddress;
import com.learn.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author 20992
 * @Date 2020/2/7
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId( String memberId) {

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);

        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";
    }
}
