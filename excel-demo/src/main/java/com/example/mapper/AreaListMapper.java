package com.example.mapper;

import com.example.model.AreaList;
import com.example.model.AreaListExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AreaListMapper {
    int countByExample(AreaListExample example);

    void insertTempTable(@Param("fromPhone") String fromPhone, @Param("toPhone") String toPhone);

    int deleteByExample(AreaListExample example);

    int insert(AreaList record);

    int insertSelective(AreaList record);

    List<AreaList> selectByExample(AreaListExample example);

    int updateByExampleSelective(@Param("record") AreaList record, @Param("example") AreaListExample example);

    int updateByExample(@Param("record") AreaList record, @Param("example") AreaListExample example);
}