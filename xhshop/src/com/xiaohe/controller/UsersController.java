package com.xiaohe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaohe.po.Userinfo;
import com.xiaohe.po.Users;
import com.xiaohe.po.UsersInfoVo;
import com.xiaohe.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersService usersService;

	/**注册
	 * 用户填写用户名和密码
	 * 判断用户名是否存在,
	 * 如果存在这返回提示用户已存在，如果不存在，则插入，返回登陆业
	 */
	
	@RequestMapping("/login")
	public String Login(Users users,Model model,HttpServletRequest request) throws Exception{
		Users result = usersService.QueryunameInUsers(users);
		if(result!=null){
			/*System.out.println("111111111111111111111111");*/
			request.getSession().setAttribute("用户名已存在", "你输入的账号或者密码错误");
		}
		else
			usersService.insertUsers(users);
			return "forward:loginsucceed.html";//注册成功页,去登陆
	}	
	
	//用户登陆
	Users users = new Users();
	@RequestMapping("/landing")
	public String userlanding(HttpServletRequest request,Users user) throws Exception{
		users = usersService.queryUserByUsers(user);
		
		if(users!=null){
			
			return "loginsuccess";
		}
		else {
			System.out.println("login fail!");
			request.getSession().setAttribute("error", "你输入的账号或者密码错误");
			return "redirect:/landing.jsp";//返回登陆页面
		}
	}
	
	
	//找回密码
	/**
	 * 用户点击找回密码，输入密保，并回答密码问题，一致，查询
		查询密码，根据问题查到答案，对比用户给的答案
	 * @return
	 */
	@RequestMapping("/findpassword")
	public String Findpassword(UsersInfoVo usersInfoVo,HttpServletRequest request ,Model model )throws Exception{
		String ufphone = request.getParameter("Ufphone");
		String uqustion = request.getParameter("Uqustion");
		String uanswer = request.getParameter("Uanswer");
		usersInfoVo.getUserinfo().setUqustion(uqustion);
		usersInfoVo.getUserinfo().setUqustion(uanswer);
		usersInfoVo.getUserinfo().setUfphone(ufphone);
		Userinfo userinfo = usersService.findpassword(usersInfoVo);
		if(userinfo!=null){//条件正确
		// 一致 查找密码	
			model.addAttribute("password", userinfo);
		}
		else {
			model.addAttribute("eorr","你输入的信息不正确，请重新输入");
		}
		return null;
	}
	//用户修改信息 1 
	@RequestMapping("/updateuserinfo")
	public String updateUserInfo(Userinfo modifyInfo,HttpServletRequest Request)throws Exception{
		usersService.updateByUserinfo(modifyInfo);
		Request.getSession().setAttribute("userinfo", modifyInfo);
		return "personalInfoDisplay";
	} 
	
		
	//查询用户信息 1
	
	/**
	 * public Userinfo queryUserInfoByUfuname(String ufuname);//修改个人信息查询service
	
		public void updatePresonalInfoByUserinfo(Userinfo modifyInfo);//修改个人信息更新service
	 * @param id
	 * @throws Exception
	 */
	
	//添加用户  用户注册差不多
	
	
	//后台删除用户   
	@RequestMapping("/deleteUsers")
	public void DeleteUsersById(int id)throws Exception{
		usersService.deleteusers(id);
	}
	
	//查看商品详情
	
	//添加购物车
	
	
	//查看购物车
	
	//查看订单
	
	//支付
}
