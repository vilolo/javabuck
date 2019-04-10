package com.example.spider.run;

import com.example.spider.controller.IndexController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Boot implements CommandLineRunner {

    @Autowired
    IndexController indexController;

    @Override
    public void run(String... args) throws Exception {
        indexController.index();
    }
}
