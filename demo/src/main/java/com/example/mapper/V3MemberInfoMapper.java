package com.example.mapper;

import com.example.model.V3MemberInfo;
import com.example.model.V3MemberInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V3MemberInfoMapper {
    int countByExample(V3MemberInfoExample example);

    int deleteByExample(V3MemberInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(V3MemberInfo record);

    int insertSelective(V3MemberInfo record);

    List<V3MemberInfo> selectByExample(V3MemberInfoExample example);

    V3MemberInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") V3MemberInfo record, @Param("example") V3MemberInfoExample example);

    int updateByExample(@Param("record") V3MemberInfo record, @Param("example") V3MemberInfoExample example);

    int updateByPrimaryKeySelective(V3MemberInfo record);

    int updateByPrimaryKey(V3MemberInfo record);
}