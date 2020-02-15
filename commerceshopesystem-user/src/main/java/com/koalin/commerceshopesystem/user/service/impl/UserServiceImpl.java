package com.koalin.commerceshopesystem.user.service.impl;



import com.koalin.commerceshopesystem.bean.UmsMember;
import com.koalin.commerceshopesystem.bean.UmsMemberLevel;
import com.koalin.commerceshopesystem.bean.UmsMemberReceiveAddress;
import com.koalin.commerceshopesystem.service.UserService;
import com.koalin.commerceshopesystem.user.mapper.UmsMemberLevelMapper;
import com.koalin.commerceshopesystem.user.mapper.UmsMemberReceiveAddressMapper;
import com.koalin.commerceshopesystem.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Autowired
    UmsMemberLevelMapper umsMemberLevelMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
        //  return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReciveAddressByMemverId(String memberId) {
        //   List<UmsMemberReceiveAddress> umsMemberReceiveAddresses= umsMemberReceiveAddressMapper.getReciveAddressByMemverId(memberId);
//        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//
//        umsMemberReceiveAddress.setMemberId(memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);


        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);


        return umsMemberReceiveAddresses;


    }

    @Override
    public List<UmsMemberLevel> getAllMemberLevel() {

        List<UmsMemberLevel> umsMemberReceiveAddresses = umsMemberLevelMapper.selectAllMemberLevel();
        //  List<UmsMemberLevel> umsMemberReceiveAddresses = umsMemberLevelMapper.selectAll();
        return umsMemberReceiveAddresses;
    }
}
