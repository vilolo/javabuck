package com.example.exceldemo;

import com.example.exceldemo.mzmall.InExcel;
import com.example.mapper.AreaListMapper;
import com.example.model.AreaList;
import com.example.model.AreaListExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    AreaListMapper areaListMapper;

    @Autowired
    InExcel inExcel;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("aaa");
        AreaListExample example = new AreaListExample();
        AreaListExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo((byte) 1);
        //int t = areaListMapper.countByExample(example);

        //inExcel.ImporeJxsData();
        inExcel.InputPhone();
    }

}
