package com.example.mapper;

import com.example.model.V3MemberAgent;
import com.example.model.V3MemberAgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V3MemberAgentMapper {
    int countByExample(V3MemberAgentExample example);

    int deleteByExample(V3MemberAgentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(V3MemberAgent record);

    int insertSelective(V3MemberAgent record);

    List<V3MemberAgent> selectByExample(V3MemberAgentExample example);

    V3MemberAgent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") V3MemberAgent record, @Param("example") V3MemberAgentExample example);

    int updateByExample(@Param("record") V3MemberAgent record, @Param("example") V3MemberAgentExample example);

    int updateByPrimaryKeySelective(V3MemberAgent record);

    int updateByPrimaryKey(V3MemberAgent record);

    List<V3MemberAgent> selectAgentList();

    V3MemberAgent getHighestAgentLevel(Integer memberId);
}