package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * author:
 * Data: 2020/3/1515:39
 **/
@Component
public interface UserMapper extends Mapper<UmsMember> {
    // List<UmsMember> selectAllUser();
}
