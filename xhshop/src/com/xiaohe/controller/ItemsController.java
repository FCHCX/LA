package com.xiaohe.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;
import com.xiaohe.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
	//商品上架
	@RequestMapping("/addItems")
	public String addItems(ShopinfoCustom shopinfoCustom,MultipartFile shopinfo_pic) throws Exception{
		String originalFilename=shopinfo_pic.getOriginalFilename();
		if(shopinfo_pic!=null&&originalFilename!=null&&originalFilename.length()>0){
			
			String pic_path="F:\\upload\\";
			
			String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile=new File(pic_path+newFileName);
			shopinfo_pic.transferTo(newFile);
			shopinfoCustom.setSimgpath(newFileName);
//			System.out.println(newFileName);
//			System.out.println(originalFilename.substring(originalFilename.lastIndexOf(".")));
		}
		itemsService.addItems(shopinfoCustom);
		return null;
		
	}
	
	//查询商品
	@RequestMapping("/queryAllItems")
	@ResponseBody
	public List<ShopinfoCustom> queryItems() throws Exception{
		
		return  itemsService.queryAllItems();
//		ShopinfoCustom shopinfoCustom =  (ShopinfoCustom) itemsService.queryAllItems();
//		return  shopinfoCustom;
		
		
	}
	//商品下架
	@RequestMapping("/deleterItems")
	
	public String deleterItems(Integer id) throws Exception{
		itemsService.deleterItems(id);
		return null;
				
	}
	
	//商品修改
	@RequestMapping("/updateItems")
	
	public String updateItems(ShopinfoCustom shopinfoCustom) throws Exception{
		
		itemsService.updateItems(shopinfoCustom);
		
		return null;
		
	}
	//商品搜索
	@RequestMapping("/searchItems")
	@ResponseBody
	public List<ShopinfoCustom> searchItems(ShopinfoQueryVo shopinfoQueryVo) throws Exception{
		
		return itemsService.searchItems(shopinfoQueryVo);
//		return null;
		
		
		
	}
	
	//商品按类型查询
	@RequestMapping("/queryItemsByType")
	@ResponseBody
	public List<ShopinfoCustom> queryItemsByType(ShopinfoQueryVo shopinfoQueryVo) throws Exception{
		
		return itemsService.queryItemsByType(shopinfoQueryVo);
//		return null;
			
		
	}
	
	
	//商品按价格大小排序显示
	
	@RequestMapping("/queryItemsByPriceSize")
	@ResponseBody
	public List<ShopinfoCustom> queryItemsByPriceSize(String pSize) throws Exception{
		
		if(pSize.equals("按从大到小排序")){
		return itemsService.queryItemsByPriceSize();
		}else{
			//按从小到大排序
			return itemsService.queryItemsByPriceSize2();
		}
		
		
		
	}
	
	
	
}
