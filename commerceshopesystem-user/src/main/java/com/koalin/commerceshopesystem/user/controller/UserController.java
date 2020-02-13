package com.koalin.commerceshopesystem.user.controller;

import com.koalin.commerceshopesystem.user.bean.UmsMember;
import com.koalin.commerceshopesystem.user.bean.UmsMemberLevel;
import com.koalin.commerceshopesystem.user.bean.UmsMemberReceiveAddress;
import com.koalin.commerceshopesystem.user.common.CommonResult;
import com.koalin.commerceshopesystem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @ClassName UserController
 * @Author koalin
 * @Description //TODO UserController的描述
 * @Date 2020/2/13 16:54
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";

    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public  List<UmsMember> getAllUser(){
        CommonResult result =new CommonResult();
        List<UmsMember> umsMembers=userService.getAllUser();
        result.setData(umsMembers);
        return umsMembers;

    }
    @RequestMapping("getReciveAddressByMemverId")
    @ResponseBody
    public  List<UmsMemberReceiveAddress> getReciveAddressByMemverId(String memberId){
        CommonResult result =new CommonResult();
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getReciveAddressByMemverId(memberId);
        result.setData(umsMemberReceiveAddresses);
        return umsMemberReceiveAddresses;

    }
    @RequestMapping("getAllMemberLevel")
    @ResponseBody
    public  List<UmsMemberLevel> getAllMemberLevel(){
        CommonResult result =new CommonResult();
        List<UmsMemberLevel> umsMemberLevels=userService.getAllMemberLevel();
        result.setData(umsMemberLevels);
        return umsMemberLevels;

    }


}
