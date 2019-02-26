package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    DemoHandle demoHandle;

    @Autowired
    CountSettle countSettle;

    @Autowired
    AgentInfo agentInfo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //demoHandle.test();
        countSettle.index();
//        agentInfo.index();
    }
}
