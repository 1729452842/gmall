package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * author:
 * Data: 2020/3/1515:37
 **/
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    void addUser(UmsMember umsMember);

    void updateUser(UmsMember umsMember);

    void deleteUserById(UmsMember umsMember);
}
