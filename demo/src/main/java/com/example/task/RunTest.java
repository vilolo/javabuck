package com.example.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("running.....");
    }
}
