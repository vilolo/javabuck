package com.example.mapper;

import com.example.model.V3OrderGoodsInfo;
import com.example.model.V3OrderGoodsInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface V3OrderGoodsInfoMapper {
    int countByExample(V3OrderGoodsInfoExample example);

    int deleteByExample(V3OrderGoodsInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(V3OrderGoodsInfo record);

    int insertSelective(V3OrderGoodsInfo record);

    List<V3OrderGoodsInfo> selectByExample(V3OrderGoodsInfoExample example);

    V3OrderGoodsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") V3OrderGoodsInfo record, @Param("example") V3OrderGoodsInfoExample example);

    int updateByExample(@Param("record") V3OrderGoodsInfo record, @Param("example") V3OrderGoodsInfoExample example);

    int updateByPrimaryKeySelective(V3OrderGoodsInfo record);

    int updateByPrimaryKey(V3OrderGoodsInfo record);

    List<Map<String,Object>> rGetOrderGoodsInfo(Integer memberId);
}