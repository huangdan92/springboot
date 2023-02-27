package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    @Qualifier("impl1") //取得bean，指定bean名称为impl1
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello")   //监听hello请求
    public String hello(){
        User user=helloService.getUser(1);  //从Service取得uid为1的数据
        return "hello "+user.getName()+", uid="+user.getUid()+".";
    }
}
