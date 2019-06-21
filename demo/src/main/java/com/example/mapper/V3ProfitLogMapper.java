package com.example.mapper;

import com.example.model.V3ProfitLog;
import com.example.model.V3ProfitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V3ProfitLogMapper {
    int countByExample(V3ProfitLogExample example);

    int deleteByExample(V3ProfitLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(V3ProfitLog record);

    int insertSelective(V3ProfitLog record);

    List<V3ProfitLog> selectByExample(V3ProfitLogExample example);

    V3ProfitLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") V3ProfitLog record, @Param("example") V3ProfitLogExample example);

    int updateByExample(@Param("record") V3ProfitLog record, @Param("example") V3ProfitLogExample example);

    int updateByPrimaryKeySelective(V3ProfitLog record);

    int updateByPrimaryKey(V3ProfitLog record);
}