package com.koalin.commerceshopesystem.user.mapper;


import com.koalin.commerceshopesystem.bean.UmsMemberLevel;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @version 1.0
 * @ClassName UmsMemberLevelMapper
 * @Author koalin
 * @Description //TODO UmsMemberLevelMapper的描述
 * @Date 2020/2/14 0:28
 */
public interface UmsMemberLevelMapper  extends Mapper<UmsMemberLevel> {

    List<UmsMemberLevel> selectAllMemberLevel();
}
