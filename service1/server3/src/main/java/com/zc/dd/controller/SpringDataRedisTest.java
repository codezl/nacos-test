//package com.zc.dd.controller;
//
//import org.junit.Test;
//import org.junit.jupiter.api.DynamicTest;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring/redis.xml")
//public class SpringDataRedisTest {
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @Test
//    public void setValue(){
//        redisTemplate.boundValueOps("name").set("badao");
//    }
//    @Test
//    public void getValue(){
//        String str = (String) redisTemplate.boundValueOps("name").get();
//        System.out.println(str);
//    }
//
//}