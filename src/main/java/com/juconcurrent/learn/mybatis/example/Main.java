package com.juconcurrent.learn.mybatis.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author zhangfubing
 * @create 2020/4/22 18:55
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String resource = "com/juconcurrent/learn/mybatis/example/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
}
