package com.atguigu.gmall.controller;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
    @GetMapping ("getAll")
    public List<UserInfo> getAllUser(){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return userInfoList;
    }
}
