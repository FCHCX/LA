package com.xiaohe.mapper;

import com.xiaohe.po.Users;
import com.xiaohe.po.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String uname);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(String uname);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    public Users queryUsersByLoginUser(Users users);
}