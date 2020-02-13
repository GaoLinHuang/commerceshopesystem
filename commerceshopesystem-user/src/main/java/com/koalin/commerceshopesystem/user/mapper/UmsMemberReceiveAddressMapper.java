package com.koalin.commerceshopesystem.user.mapper;

import com.koalin.commerceshopesystem.user.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @version 1.0
 * @IinterfaceName UmsMemberReceiveAddressMapper
 * @Author koalin
 * @Description //TODO UmsMemberReceiveAddressMapper的描述
 * @Date 2020/2/13 23:49
 */
public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    List<UmsMemberReceiveAddress> getReciveAddressByMemverId(String memberId);
}
