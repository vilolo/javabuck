package com.example.jjob.service;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyElasticJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("into MyElasticJob......");
        switch (shardingContext.getShardingItem()) {
            case 0:
                // do something by sharding item 0
                break;
            case 1:
                // do something by sharding item 1
                break;
            case 2:
                // do something by sharding item 2
                break;
            // case n: ...
        }

        System.out.println(shardingContext.getShardingItem());
    }
}
