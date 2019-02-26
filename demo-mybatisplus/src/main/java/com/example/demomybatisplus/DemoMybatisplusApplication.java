package com.example.demomybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.ant.test.*")
@ComponentScan(basePackages = {"com.example.*"})
@SpringBootApplication
public class DemoMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisplusApplication.class, args);
    }

}

