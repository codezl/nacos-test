//package com.zc.dd.controller;
//
//import com.zc.dd.entity.Testuser;
//import com.zc.dd.entity.User;
//import com.zc.dd.mapper.TestuserMapper;
//import io.swagger.annotations.Api;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//@Controller
//@RequestMapping("/ts")
//@Api(tags = "test")
//public class TestuserContronller {
//
//    @Resource
//    TestuserMapper testuserMapper;
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @RequestMapping("/fo")
//    @ResponseBody
//    public String findOne(String setV) {
//        List<Testuser> testuser = testuserMapper.findOne();
//        System.out.println(testuser.toString());
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/userxml.xml");
//        Testuser bean = applicationContext.getBean(Testuser.class);
//        System.out.println(bean.toString());
////        RedisSerializer redisSerializer = new StringRedisSerializer();
//        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring/redis.xml");
//        RedisTemplate redisTemplate = applicationContext1.getBean(RedisTemplate.class);
//        redisTemplate.opsForValue().set("test","222",22,TimeUnit.SECONDS);
//        //覆盖
//        redisTemplate.opsForValue().set("test","dd",1);
//        System.out.println(redisTemplate.opsForValue().get("test"));
//        //设置map值
//        Map map = new HashMap();
//        map.put("hh","22");
//        redisTemplate.opsForValue().multiSet(map);
//        redisTemplate.boundValueOps("name").set(setV);
//        Object name = redisTemplate.boundValueOps("name").get();
//        redisTemplate.expire("name",20, TimeUnit.SECONDS);
//        System.out.println(name.toString());
//        return "1";
//    }
//
//    @RequestMapping("/fo1")
//    @ResponseBody
//    public String findOne1() {
//        List<Testuser> testuser = testuserMapper.findOne();
//        System.out.println(testuser.toString());
//        Object name = redisTemplate.boundValueOps("name").get();
//        if (name==null) {
//            System.out.println("值不存在，set一个新值");
//            User user = new User();
//            user.setName("aaa");
//            user.setNickName("bbb");
//            redisTemplate.boundValueOps("name").set(user.getName(),10,TimeUnit.SECONDS);
//            //redisTemplate.expire("name",5, TimeUnit.SECONDS);
//        }else {
//            System.out.println(name.toString());
//        }
//        return "1";
//    }
//}
