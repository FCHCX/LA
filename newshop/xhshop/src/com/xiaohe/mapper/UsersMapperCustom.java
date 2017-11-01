package com.xiaohe.mapper;

public interface UsersMapperCustom {

	public String selectByuname(String uname)throws Exception;

	public void insertUsers(String uname, String upwd)throws Exception;
	

}
