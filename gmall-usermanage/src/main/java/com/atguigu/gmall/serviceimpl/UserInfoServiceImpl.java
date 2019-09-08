package com.atguigu.gmall.serviceimpl;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.mapper.UserInfoMapper;
import com.atguigu.gmall.service.UserInfoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getUserInfoList() {

        return userInfoMapper.selectAll();
    }
}
