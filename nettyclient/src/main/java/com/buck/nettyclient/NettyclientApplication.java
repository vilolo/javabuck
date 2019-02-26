package com.buck.nettyclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyclientApplication {

    public static void main(String[] args) {
        //SpringApplication.run(NettyclientApplication.class, args);
        String host = "127.0.0.1";
        int port = 8111;
        NettyClient nettyClient = new NettyClient(host, port);
        nettyClient.connect();
    }
}
