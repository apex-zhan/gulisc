package com.atguigu.gulimall.gulimallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 整合mybatis-plus
 * 1.引入依赖
 * 2.配置数据源, 配置mybatis-plus
 * 3.@MapperScan用于扫描指定包下的类，以便于Spring Boot应用能够自动发现并加载这些类并将它们注册为Spring的Bean
 * 4.告诉mybatis-plus,sql的映射文件在哪，在yml中书写
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.gulimall")//指定扫描的包路径。


public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
