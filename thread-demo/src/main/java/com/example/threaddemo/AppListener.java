package com.example.threaddemo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {

    private void test(){
        Demo<String, Integer> demo = new Demo<>();
        demo.test();
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        test();
    }
}
