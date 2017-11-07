package com.xiaohe.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaohe.mapper.ShopinfoMapperCustom;
import com.xiaohe.po.Shopinfo;
import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;
import com.xiaohe.po.Users;
import com.xiaohe.po.UsersInfoVo;
import com.xiaohe.service.ItemsService;
import com.xiaohe.service.UsersService;
@SuppressWarnings("SpellCheckingInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:/spring/applicationContext-*.xml")
public class TestJava {
	///slf4j-log4j12-1.7.5.jar
	@Autowired
	@Qualifier("itemsService")
	private ItemsService itemsService;
	
	@Qualifier("usersService")
	private UsersService usersService;
	
	
	@Test
	public void test() throws Exception {
		//测试查询全部商品
		
		
		System.out.println(itemsService.queryAllItems());
		
	}
	@Test
	//测试按区间查询商品
	public void test1() {
		ShopinfoQueryVo shopinfoQueryVo = new ShopinfoQueryVo();
		shopinfoQueryVo.setLeft("1111");
		shopinfoQueryVo.setRight("2222");
		
		System.out.println(itemsService.queryItemsByBetweenSize(shopinfoQueryVo));
	}
	@Test
//测试商品搜索
	public void test2() throws Exception{
		//Shopinfo shopinfo=new Shopinfo();
		ShopinfoQueryVo shopinfoQueryVo = new ShopinfoQueryVo();
		shopinfoQueryVo.setShopinfoCustom(new ShopinfoCustom());
		shopinfoQueryVo.getShopinfoCustom().setSname("手机");
		System.out.println(itemsService.searchItems(shopinfoQueryVo));
		//shopinfo.setSname("手机");
		//System.out.println(itemsService.searchItems(shopinfoQueryVo));
		//System.out.println(itemsService.searchItems(shopinfoQueryVo));
	}
	//商品按类型查询
	@Test
	public void test3() throws Exception{
		ShopinfoQueryVo shopinfoQueryVo = new ShopinfoQueryVo();
		//Shopinfo shopinfo=new Shopinfo();
		//shopinfo.setStype("电脑");
		shopinfoQueryVo.setShopinfoCustom(new ShopinfoCustom());
		shopinfoQueryVo.getShopinfoCustom().setStype("手机");
		System.out.println(itemsService.queryItemsByType(shopinfoQueryVo));
	}
	
	
	@Test
	public void test4() throws Exception{
		Users user = new Users();
		user.setUname("kjsfk");
		user.setUpwd("123456");
		System.out.println(usersService.QueryunameInUsers(user));
	}
}
