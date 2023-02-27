package com.example.demo.service;


import com.example.demo.entity.User;

//服务接口
public interface HelloService {
    User getUser(long uid);  //通过uid取得用户名称
}