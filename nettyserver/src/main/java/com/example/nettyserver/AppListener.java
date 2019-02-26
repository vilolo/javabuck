package com.example.nettyserver;

import com.example.ws.WebSocketServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        this.simpleSocket(event);
        this.webSocket(event);
    }

    private void simpleSocket(ContextRefreshedEvent event) {
        ApplicationContext ac = event.getApplicationContext();
        NettyServer nettyServer= ac.getBean(NettyServer.class);
        Thread thread = new Thread(nettyServer);
        thread.start();
    }

    private void webSocket(ContextRefreshedEvent event) {
        ApplicationContext ac = event.getApplicationContext();
        WebSocketServer nettyServer= ac.getBean(WebSocketServer.class);
        Thread thread = new Thread(nettyServer);
        thread.start();
    }
}
