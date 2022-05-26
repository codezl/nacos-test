//package com.zc.dd.controller;
//
//import com.zc.dd.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//    //如果mapper上没有使用@compment，那么可以使用@resource注解重写mapper类进行引用
//    //如果想使用@Autowired，那就要使用@compment
//    @Resource
//    UserMapper userMapper;
//
//    @RequestMapping("/getAll")
//    @ResponseBody
//    public String getAll() {
//        System.out.println(userMapper.findAll().toString());
//        return "niahao";
//    }
//}
