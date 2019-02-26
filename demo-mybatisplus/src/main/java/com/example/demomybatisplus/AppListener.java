package com.example.demomybatisplus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    DemoHandle demoHandle;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        demoHandle.index();
    }
}
