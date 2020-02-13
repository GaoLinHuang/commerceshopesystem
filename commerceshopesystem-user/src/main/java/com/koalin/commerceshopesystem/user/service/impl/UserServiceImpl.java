package com.koalin.commerceshopesystem.user.service.impl;

import com.koalin.commerceshopesystem.user.bean.UmsMember;
import com.koalin.commerceshopesystem.user.mapper.UserMapper;
import com.koalin.commerceshopesystem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @ClassName UserServiceImpl
 * @Author koalin
 * @Description //TODO UserServiceImpl的描述
 * @Date 2020/2/13 16:56
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
