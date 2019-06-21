package top.mozi.service.cli.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import top.mozi.service.appmq.client.HashrateReceiveEventClient;
import top.mozi.service.appmq.common.dto.AppMqMessageDto;

@Component
public class run implements CommandLineRunner {
    @Lazy
    @Autowired
    private HashrateReceiveEventClient hashrateReceiveEventClient;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("into ...................run");
        AppMqMessageDto appMqMessageDto = new AppMqMessageDto();
        appMqMessageDto.setMessageTime(123L);
        appMqMessageDto.setMessageId("11");
        appMqMessageDto.setMessageBody("body");
        appMqMessageDto.setType("device_bind");
        appMqMessageDto.setGlobalTraceId("bbb");
        Integer res = hashrateReceiveEventClient.receiveAllEvent(appMqMessageDto);
        System.out.println(res);
        System.out.println("asdfsadfsadfdsf");
    }
}
