package com.xiaohe.mapper;

import com.xiaohe.po.Assess;
import com.xiaohe.po.AssessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessMapper {
    int countByExample(AssessExample example);

    int deleteByExample(AssessExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Assess record);

    int insertSelective(Assess record);

    List<Assess> selectByExample(AssessExample example);

    Assess selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Assess record, @Param("example") AssessExample example);

    int updateByExample(@Param("record") Assess record, @Param("example") AssessExample example);

    int updateByPrimaryKeySelective(Assess record);

    int updateByPrimaryKey(Assess record);
}