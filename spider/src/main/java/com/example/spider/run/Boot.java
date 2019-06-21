package com.example.spider.run;

import com.example.spider.controller.AlibabaController;
import com.example.spider.controller.IndexController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Boot implements CommandLineRunner {

    @Autowired
    IndexController indexController;

    @Autowired
    AlibabaController alibabaController;

    @Override
    public void run(String... args) throws Exception {
        //indexController.index();
        alibabaController.index();
    }
}
