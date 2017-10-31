package com.xiaohe.mapper;

import com.xiaohe.po.Itemdiscount;
import com.xiaohe.po.ItemdiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemdiscountMapper {
    int countByExample(ItemdiscountExample example);

    int deleteByExample(ItemdiscountExample example);

    int deleteByPrimaryKey(Integer disid);

    int insert(Itemdiscount record);

    int insertSelective(Itemdiscount record);

    List<Itemdiscount> selectByExample(ItemdiscountExample example);

    Itemdiscount selectByPrimaryKey(Integer disid);

    int updateByExampleSelective(@Param("record") Itemdiscount record, @Param("example") ItemdiscountExample example);

    int updateByExample(@Param("record") Itemdiscount record, @Param("example") ItemdiscountExample example);

    int updateByPrimaryKeySelective(Itemdiscount record);

    int updateByPrimaryKey(Itemdiscount record);
}