package com.example.mapper;

import com.example.model.V3OrderInfo;
import com.example.model.V3OrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V3OrderInfoMapper {
    int countByExample(V3OrderInfoExample example);

    int deleteByExample(V3OrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(V3OrderInfo record);

    int insertSelective(V3OrderInfo record);

    List<V3OrderInfo> selectByExample(V3OrderInfoExample example);

    V3OrderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") V3OrderInfo record, @Param("example") V3OrderInfoExample example);

    int updateByExample(@Param("record") V3OrderInfo record, @Param("example") V3OrderInfoExample example);

    int updateByPrimaryKeySelective(V3OrderInfo record);

    int updateByPrimaryKey(V3OrderInfo record);
}