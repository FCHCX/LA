package com.xiaohe.mapper;

import com.xiaohe.po.Backstock;
import com.xiaohe.po.BackstockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackstockMapper {
    int countByExample(BackstockExample example);

    int deleteByExample(BackstockExample example);

    int deleteByPrimaryKey(Integer bsid);

    int insert(Backstock record);

    int insertSelective(Backstock record);

    List<Backstock> selectByExample(BackstockExample example);

    Backstock selectByPrimaryKey(Integer bsid);

    int updateByExampleSelective(@Param("record") Backstock record, @Param("example") BackstockExample example);

    int updateByExample(@Param("record") Backstock record, @Param("example") BackstockExample example);

    int updateByPrimaryKeySelective(Backstock record);

    int updateByPrimaryKey(Backstock record);
}