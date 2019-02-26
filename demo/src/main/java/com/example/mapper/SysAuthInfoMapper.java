package com.example.mapper;

import com.example.model.SysAuthInfo;
import com.example.model.SysAuthInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysAuthInfoMapper {
    List<Map<String, String>> wxImgList();

    int countByExample(SysAuthInfoExample example);

    int deleteByExample(SysAuthInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAuthInfo record);

    int insertSelective(SysAuthInfo record);

    List<SysAuthInfo> selectByExample(SysAuthInfoExample example);

    SysAuthInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAuthInfo record, @Param("example") SysAuthInfoExample example);

    int updateByExample(@Param("record") SysAuthInfo record, @Param("example") SysAuthInfoExample example);

    int updateByPrimaryKeySelective(SysAuthInfo record);

    int updateByPrimaryKey(SysAuthInfo record);
}