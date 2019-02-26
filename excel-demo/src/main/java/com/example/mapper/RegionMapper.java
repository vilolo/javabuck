package com.example.mapper;

import com.example.model.Region;
import com.example.model.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RegionMapper {
    Region getRegionByName(@Param("areaName") String areaName, @Param("areaLevel") Integer areaLevel);

    int countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);
}