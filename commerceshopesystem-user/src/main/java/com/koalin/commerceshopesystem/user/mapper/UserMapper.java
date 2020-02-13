package com.koalin.commerceshopesystem.user.mapper;

import com.koalin.commerceshopesystem.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @version 1.0
 * @ClassName UserMapper
 * @Author koalin
 * @Description //TODO UserMapper的描述
 * @Date 2020/2/13 16:57
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<UmsMember> {
   List<UmsMember> selectAllUser();
}
