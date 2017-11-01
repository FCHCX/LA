package com.xiaohe.mapper;

import com.xiaohe.po.Controllers;
import com.xiaohe.po.ControllersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ControllersMapper {
    int countByExample(ControllersExample example);

    int deleteByExample(ControllersExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Controllers record);

    int insertSelective(Controllers record);

    List<Controllers> selectByExample(ControllersExample example);

    Controllers selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Controllers record, @Param("example") ControllersExample example);

    int updateByExample(@Param("record") Controllers record, @Param("example") ControllersExample example);

    int updateByPrimaryKeySelective(Controllers record);

    int updateByPrimaryKey(Controllers record);
}