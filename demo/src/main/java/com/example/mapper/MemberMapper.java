package com.example.mapper;

import com.example.model.Member;
import com.example.model.MemberExample;
import com.example.model.MemberWithBLOBs;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberWithBLOBs record);

    int insertSelective(MemberWithBLOBs record);

    List<MemberWithBLOBs> selectByExampleWithBLOBs(MemberExample example);

    List<Member> selectByExample(MemberExample example);

    MemberWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberWithBLOBs record, @Param("example") MemberExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberWithBLOBs record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(MemberWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MemberWithBLOBs record);

    int updateByPrimaryKey(Member record);

    //=================

    List<Member> getRelationsMember(Integer memberId);

    Map<String, Object> getMemberInfo(Integer memberId);

    //直推渠道商
    int countDirectAgent(@Param("memberId") Integer memberId, @Param("level") Integer level, @Param("startTimestemp") Integer startTimestemp, @Param("endTimestemp") Integer endTimestemp);

    //直推店长或会员
    int countDirectMember(@Param("memberId") Integer memberId, @Param("level") Integer level, @Param("startTimestemp") Integer startTimestemp, @Param("endTimestemp") Integer endTimestemp);
}