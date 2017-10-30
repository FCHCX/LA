package com.xiaohe.mapper;

import com.xiaohe.po.Shopinfo;
import com.xiaohe.po.ShopinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopinfoMapper {
    int countByExample(ShopinfoExample example);

    int deleteByExample(ShopinfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Shopinfo record);

    int insertSelective(Shopinfo record);

    List<Shopinfo> selectByExample(ShopinfoExample example);

    Shopinfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Shopinfo record, @Param("example") ShopinfoExample example);

    int updateByExample(@Param("record") Shopinfo record, @Param("example") ShopinfoExample example);

    int updateByPrimaryKeySelective(Shopinfo record);

    int updateByPrimaryKey(Shopinfo record);
   // public void insert(Float Sprice);
}