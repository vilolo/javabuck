package com.buck.eurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

@Component
public class Test implements Runnable {
    @Override
    public void run() {
        startStreamTask();
    }

    @Autowired
    private DiscoveryClient client; // 服务发现客户端

    @Value("${k1}")
    private String val;

    @Value("${spring.application.name}")
    private String val2;

    private void startStreamTask() {

        //do your business
        System.out.println("kkkk");


        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(val2);
        }

    }
}
