//package com.codezl.nacos.redis;
//
//import org.springframework.beans.factory.annotation.Value;
//import redis.clients.jedis.Jedis;
//public class RedisTest {
//
//    @Value("${spring.redis.host}")
//    public String host;
//
//    @Value("${spring.application.name}")
//     String alipayName;
//        public static void main(String[] args) {
//            RedisTest redisTest = new RedisTest();
//            System.out.println(redisTest.host);
//            //连接本地的 Redis 服务
//            Jedis jedis = new Jedis("localhost");
//            //查看支付宝name
//            jedis.set("2","2");
//            jedis.append("2","好");
//            System.out.println("设值"+jedis.get("2")+"统计");
//            jedis.del("2");
//            System.out.println("删除"+jedis.get("2"));
//            System.out.println(redisTest.alipayName);
//            // 如果 Redis 服务设置了密码，需要下面这行，没有就不需要
//            // jedis.auth("123456");
//            System.out.println("连接成功");
//            //查看服务是否运行
//            System.out.println("服务正在运行: "+jedis.ping());
//    }
//
//    private String ty() {
//            return this.host;
//    }
//}
