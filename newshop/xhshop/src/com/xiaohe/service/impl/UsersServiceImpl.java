package com.xiaohe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaohe.mapper.*;
import com.xiaohe.service.UsersService;

public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersMapperCustom usersMapperCustom;

	/**
	 * @throws Exception 
	 * 
	 */
	@Override
	public String QueryunameInUsers(String uname) throws Exception{
		// TODO Auto-generated method stub
		
		String re = usersMapperCustom.selectByuname(uname);
		if(re!=null){
			
			return re;
		}
		else
		return null;
	}

	@Override
	public void insertUsers(String uname, String upwd) throws Exception{
		// TODO Auto-generated method stub
		usersMapperCustom.insertUsers(uname, upwd);
	}
}
