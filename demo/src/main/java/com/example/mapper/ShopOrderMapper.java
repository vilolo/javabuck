package com.example.mapper;

import com.example.model.ShopOrder;
import com.example.model.ShopOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopOrderMapper {
    int countByExample(ShopOrderExample example);

    int deleteByExample(ShopOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrder record);

    int insertSelective(ShopOrder record);

    List<ShopOrder> selectByExampleWithBLOBs(ShopOrderExample example);

    List<ShopOrder> selectByExample(ShopOrderExample example);

    ShopOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopOrder record, @Param("example") ShopOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopOrder record, @Param("example") ShopOrderExample example);

    int updateByExample(@Param("record") ShopOrder record, @Param("example") ShopOrderExample example);

    int updateByPrimaryKeySelective(ShopOrder record);

    int updateByPrimaryKeyWithBLOBs(ShopOrder record);

    int updateByPrimaryKey(ShopOrder record);

    List<ShopOrder> getShopOrderByMonth(@Param("memberId") int memberId, @Param("month") String month);

    //goods_level : 1=会员业绩，2=店长业绩
    List<ShopOrder> getDirectOrder(@Param("memberId") int memberId, @Param("month") String month);
}