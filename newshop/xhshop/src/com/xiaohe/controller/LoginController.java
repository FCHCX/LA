package com.xiaohe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaohe.service.UsersService;

@Controller
@RequestMapping("/users")
public class LoginController {
	
	/**注册
	 * 用户填写用户名和密码
	 * 判断用户名是否存在
	 * 如果存在这返回提示用户已存在，如果不存在，则插入，返回注册成功
	 */
	private UsersService usersService;
	
	@RequestMapping("/login")
	public String Login(String uname,String upwd) throws Exception{
		String resturt = usersService.QueryunameInUsers(uname);
		if(resturt!=null){
			usersService.insertUsers(uname,upwd);
			return "forward:loginsucceed.html";//注册成功页
		}
		else
			return "forward:login.html";//重新回到注册页
	}
	
}