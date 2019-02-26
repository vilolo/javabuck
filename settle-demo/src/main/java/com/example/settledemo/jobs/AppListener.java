package com.example.settledemo.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    Settle settle;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        settle.index();
    }
}
