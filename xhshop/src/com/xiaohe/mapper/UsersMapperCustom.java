package com.xiaohe.mapper;

import com.xiaohe.po.Userinfo;
import com.xiaohe.po.Users;
import com.xiaohe.po.UsersInfoVo;

public interface UsersMapperCustom {

	//注册查询用户名
	public Users selectByuname(Users users)throws Exception;
	//插入用户
	public void insertUsers(Users users)throws Exception;
	//查询用户问题和答案匹配
	public Userinfo findpassword(UsersInfoVo usersInfoVo)throws Exception;
	//用户登陆
	public Users queryUserByUsers(Users user)throws Exception;
	

}
