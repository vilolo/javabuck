package com.example.mapper;

import com.example.model.ProfitLog;
import com.example.model.ProfitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfitLogMapper {
    int countByExample(ProfitLogExample example);

    int deleteByExample(ProfitLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProfitLog record);

    int insertSelective(ProfitLog record);

    List<ProfitLog> selectByExample(ProfitLogExample example);

    ProfitLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProfitLog record, @Param("example") ProfitLogExample example);

    int updateByExample(@Param("record") ProfitLog record, @Param("example") ProfitLogExample example);

    int updateByPrimaryKeySelective(ProfitLog record);

    int updateByPrimaryKey(ProfitLog record);

    //获取某月份成为渠道商后的店长推荐佣金和会员推荐佣金的订单
    List<ProfitLog> getOrder(@Param("month") String month, @Param("memberId") int memberId);
}