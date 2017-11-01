package com.xiaohe.mapper;

import com.xiaohe.po.Buycar;
import com.xiaohe.po.BuycarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuycarMapper {
    int countByExample(BuycarExample example);

    int deleteByExample(BuycarExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Buycar record);

    int insertSelective(Buycar record);

    List<Buycar> selectByExample(BuycarExample example);

    Buycar selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Buycar record, @Param("example") BuycarExample example);

    int updateByExample(@Param("record") Buycar record, @Param("example") BuycarExample example);

    int updateByPrimaryKeySelective(Buycar record);

    int updateByPrimaryKey(Buycar record);
}