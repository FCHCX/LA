package com.xiaohe.service.impl;

import com.xiaohe.mapper.UsersMapperCustom;
import com.xiaohe.po.Userinfo;
import com.xiaohe.po.Users;
import com.xiaohe.po.UsersInfoVo;
import com.xiaohe.service.UsersService;

public class UsersServiceImpl implements UsersService{

	private UsersMapperCustom usersMapperCustom;
	
	//用户登陆查询用户名和密码
	@Override
	public Users queryUserByUsers(Users user) throws Exception {
		// TODO Auto-generated method stub
		
		return usersMapperCustom.queryUserByUsers(user);
		
	}

	@Override
	public Userinfo queryUserInfoByUfuname(String uname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	//注册
	@Override
	public Users QueryunameInUsers(Users users) throws Exception {
		// TODO Auto-generated method stub
		return usersMapperCustom.selectByuname(users);
	
	}

	@Override
	public void insertUsers(Users users) throws Exception {
		// TODO Auto-generated method stub
		usersMapperCustom.insertUsers(users);
	}

	//查找用户密码
	@Override
	public Userinfo findpassword(UsersInfoVo usersInfoVo) throws Exception {
		// TODO Auto-generated method stub
		usersMapperCustom.findpassword(usersInfoVo);
		return null;
	}
	/*@Override
	public Userinfo findpassword(String uqustion, String uanswer)throws Exception {
		// TODO Auto-generated method stub
		usersMapperCustom.findpassword(uqustion,uanswer);
		return null;
	}*/

	@Override
	public String queryUsersPassword(String uqustion, String uanswer)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteusers(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateByUserinfo(Userinfo modifyInfo) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
