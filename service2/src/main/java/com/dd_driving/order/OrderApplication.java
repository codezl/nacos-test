package com.dd_driving.order;

import com.dd_driving.order.entity.DdOrder;
import com.dd_driving.order.mapper.DdOrderMapper;
import com.dd_driving.order.mapper.OrdersMapper;
import com.dd_driving.order.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;
import java.io.InputStream;

//@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.dd_driving.order.mapper")
public class OrderApplication {

    public static void main(String[] args) throws IOException {
//        SpringApplication.run(OrderApplication.class, args);
        System.out.println( "Hello World!" );
        String resource = "postgrepsql-springmvc.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=null;
        sqlSession= sqlSessionFactory.openSession();
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        DdOrder ddOrder =ordersMapper.getOrder();
        System.out.println(ddOrder.toString());
//        ddOrder.setId((long) 2);
//        ddOrder.insertStudentPojo(studentPojo);
        sqlSession.commit();
        sqlSession.close();
        SpringApplication.run(OrderApplication.class,args);
    }

}
