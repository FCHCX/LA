package com.xiaohe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaohe.po.ShopinfoQueryStore;
import com.xiaohe.po.Store;
import com.xiaohe.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;	
	//商品上架
	@RequestMapping("/addItems")
	public String addItems(){		
		return null;	
	}
	
	//查询商品信息和库存
	@RequestMapping("/selectStoreAndshopinfo")
	public String selectStoreAndshopinfo(ShopinfoQueryStore shopinfoQueryStore){
		itemsService.SelectStoreAndshopinfo(shopinfoQueryStore);
		return null;
	}
	//商品管理员修改库存
	@RequestMapping("/updateStore")
	public String updateStore(Store store){
		itemsService.updateStore(store);
		return null;
	}
}
