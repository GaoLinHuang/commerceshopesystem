package com.koalin.commerceshopesystem.service;
import com.koalin.commerceshopesystem.bean.UmsMember;
import com.koalin.commerceshopesystem.bean.UmsMemberLevel;
import com.koalin.commerceshopesystem.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @version 1.0
 * @ClassName UserService
 * @Author koalin
 * @Description //TODO UserService的描述
 * @Date 2020/2/13 16:55
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReciveAddressByMemverId(String memberId);

    List<UmsMemberLevel> getAllMemberLevel();
}
