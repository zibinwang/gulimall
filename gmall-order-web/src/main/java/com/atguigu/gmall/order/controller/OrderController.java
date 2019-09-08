package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Reference
    private UserInfoService userInfoService;

    @RequestMapping("trade")
    //页面转跳
    public String index(){
        return "index";
    }

    @GetMapping("list")
    @ResponseBody
    public List<UserAddress> trade(String userId){
        //返回json数据
        return userInfoService.getUserAddressList(userId);
    }



}
