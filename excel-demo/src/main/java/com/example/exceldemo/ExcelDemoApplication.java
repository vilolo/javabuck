package com.example.exceldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.*")
@ComponentScan(basePackages = {"com.example.*"})
public class ExcelDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcelDemoApplication.class, args);
    }

}

