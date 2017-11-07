package com.xiaohe.service;

import com.xiaohe.po.Userinfo;
import com.xiaohe.po.Users;
import com.xiaohe.po.UsersInfoVo;

public interface UsersService {

	//用户登陆
	public Users queryUserByUsers(Users user) throws Exception; 

	public Userinfo queryUserInfoByUfuname(String uname)  throws Exception;
	
	//用户注册时查找用户名是否存在
	public Users QueryunameInUsers(Users users) throws Exception;
	
	//用户注册后，插入数据库
	public void insertUsers(Users users)throws Exception;

	//查找用户密码
	public Userinfo findpassword(UsersInfoVo usersInfoVo)throws Exception;

	public String queryUsersPassword(String uqustion, String uanswer)throws Exception;

	public void deleteusers(int id)throws Exception;

	public void updateByUserinfo(Userinfo modifyInfo)throws Exception;

	

}
