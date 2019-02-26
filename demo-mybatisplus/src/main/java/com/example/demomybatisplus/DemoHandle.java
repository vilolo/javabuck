package com.example.demomybatisplus;

import com.example.ant.test.entity.Ttt;
import com.example.ant.test.mapper.TttMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DemoHandle {

    @Autowired
    TttMapper tttMapper;

    @Autowired
    private Environment env;

    void index(){
        Ttt t = tttMapper.selectById("1");
       // Ttt t1 = new Ttt();
                //tttMapper.selectOne(t);
        System.out.println(t.getName());
        System.out.println(env.getProperty("mybatis.mapperLocations"));
    }
}
