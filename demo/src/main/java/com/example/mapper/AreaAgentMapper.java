package com.example.mapper;

import com.example.model.AreaAgent;
import com.example.model.AreaAgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaAgentMapper {
    int countByExample(AreaAgentExample example);

    int deleteByExample(AreaAgentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaAgent record);

    int insertSelective(AreaAgent record);

    List<AreaAgent> selectByExample(AreaAgentExample example);

    AreaAgent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaAgent record, @Param("example") AreaAgentExample example);

    int updateByExample(@Param("record") AreaAgent record, @Param("example") AreaAgentExample example);

    int updateByPrimaryKeySelective(AreaAgent record);

    int updateByPrimaryKey(AreaAgent record);

    //===================
    List<AreaAgent> getLevelList(Integer type);
}