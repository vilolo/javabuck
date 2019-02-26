package com.example.nettyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class NettyserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(NettyserverApplication.class, args);
    }
}
