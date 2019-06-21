package top.mozi.service.cli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients(basePackages={"top.mozi"})
@SpringBootApplication
@ComponentScan(basePackages = {"top.mozi"})
public class TestMqCliApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMqCliApplication.class, args);
    }

}
