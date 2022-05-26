package com.dd_driving.order.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
    
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final Class CLASS_LOCK=SqlSessionFactoryUtils.class;
    
    private SqlSessionFactoryUtils() {
        
    }
    public static SqlSessionFactory initSqlSessionFactory() {
        String resource = "mybatis_config.xml";
        InputStream inputStream = null;
        try {
            inputStream=Resources.getResourceAsStream(resource);
        } catch (IOException e) {

            System.out.println(e.getStackTrace());
        }
        synchronized (CLASS_LOCK) {
            if(sqlSessionFactory==null) {
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }
    public static SqlSession openSqlSession() {
        if(sqlSessionFactory==null) {
             initSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}