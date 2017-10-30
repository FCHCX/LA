package com.xiaohe.mapper;

import com.xiaohe.po.Shaddress;
import com.xiaohe.po.ShaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShaddressMapper {
    int countByExample(ShaddressExample example);

    int deleteByExample(ShaddressExample example);

    int deleteByPrimaryKey(Integer shid);

    int insert(Shaddress record);

    int insertSelective(Shaddress record);

    List<Shaddress> selectByExample(ShaddressExample example);

    Shaddress selectByPrimaryKey(Integer shid);

    int updateByExampleSelective(@Param("record") Shaddress record, @Param("example") ShaddressExample example);

    int updateByExample(@Param("record") Shaddress record, @Param("example") ShaddressExample example);

    int updateByPrimaryKeySelective(Shaddress record);

    int updateByPrimaryKey(Shaddress record);
}