package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * author:
 * Data: 2020/3/1515:36
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";
    }

    @RequestMapping("addUser")
    @ResponseBody
    public void addUser(String Id) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(Id);
        umsMember.setUsername("张三");
        umsMember.setPassword("123");
        umsMember.setBirthday(new Date());
        userService.addUser(umsMember);
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public void updateUser(String Id) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(Id);
        umsMember.setUsername("李四1");
        umsMember.setPassword("456");
        umsMember.setBirthday(new Date());
        userService.updateUser(umsMember);
    }

    @RequestMapping("deleteUserById")
    @ResponseBody
    public void deleteUserById(String Id) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(Id);
        userService.deleteUserById(umsMember);
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddress;
    }
}
