package com.xiaohe.po;

public class UsersInfoVo {
	
	private Users users;
	
	private Userinfo userinfo;

	public Users getUsers() {
		return users;
	}
	
	public void setUsers(Users users) {
		this.users = users;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	@Override
	public String toString() {
		return "UsersInfoVo [users=" + users + ", userinfo=" + userinfo + "]";
	}
	
}
