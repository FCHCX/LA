package com.xiaohe.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		//上传照片
		String originalFilename=shopinfo_pic.getOriginalFilename();
		if(shopinfo_pic!=null&&originalFilename!=null&&originalFilename.length()>0){
			
			String pic_path="F:\\upload\\";
			
			String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile=new File(pic_path+newFileName);
			shopinfo_pic.transferTo(newFile);
			shopinfoCustom.setSimgpath(newFileName);

		}
		//添加商品
		itemsService.addItems(shopinfoCustom);
		return "redirect:/items/searchItems.action";
		
	}
	
	//查询商品
	@RequestMapping("/queryAllItems")
	
	public List<ShopinfoCustom> queryItems() throws Exception{
		List<ShopinfoCustom> shopinfoList=itemsService.queryAllItems();
		return  shopinfoList;
		
	}
	//单个商品删除
	@RequestMapping("/deleteSingle")
	public String deleteSingle(Integer  items_id) throws Exception{
		itemsService.deletesingle(items_id);
		return "redirect:/items/searchItems.action";
				
	}
	//商品删除批量
	@RequestMapping("/deleteItemsByMoreId")
	
	public String deleteItemsByMoreId(Integer [] items_id) throws Exception{
		itemsService.deleteItemsByMoreId(items_id);
		return "redirect:/items/searchItems.action";
				
	}
	//查询商品 跳转修改页面
	@RequestMapping(value="/editItems",method={RequestMethod.GET,RequestMethod.POST})
	public String editItems(Model model,@RequestParam(value="sid",required=true ) Integer items_id) throws Exception{
		ShopinfoCustom shopinfoCustom=itemsService.findItemsById(items_id);
		model.addAttribute("items", shopinfoCustom);
		return "picture-update";
	}
	
	//商品修改
	@RequestMapping("/updateItems")
	
	public String updateItems(ShopinfoCustom shopinfoCustom,MultipartFile shopinfo_pic) throws Exception{
		//上传照片更新操作
				String originalFilename=shopinfo_pic.getOriginalFilename();
				if(shopinfo_pic!=null&&originalFilename!=null&&originalFilename.length()>0){
					
					String pic_path="F:\\upload\\";
					
					String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
					File newFile=new File(pic_path+newFileName);
					shopinfo_pic.transferTo(newFile);
					shopinfoCustom.setSimgpath(newFileName);
				}
				//添加商品
		itemsService.updateItems(shopinfoCustom);
		return "redirect:/items/searchItems.action";
	}
	
	//商品搜索
	@RequestMapping("/searchItems")
	public String searchItems(Model model,ShopinfoQueryVo shopinfoQueryVo) throws Exception{
		List<ShopinfoCustom> shopinfoList=itemsService.searchItems(shopinfoQueryVo);
		model.addAttribute("itemsList", shopinfoList);
		int number = itemsService.queryItemsAllCount();
		model.addAttribute("number", number);
		return "Products_List";
	}
	
	//商品按类型查询()
	@RequestMapping("/queryItemsByType")
	public String queryItemsByType(ShopinfoQueryVo shopinfoQueryVo,Model model) throws Exception{
		List<ShopinfoCustom> shopinfoList=itemsService.queryItemsByType(shopinfoQueryVo);
		model.addAttribute("itemsList", shopinfoList);
		return "Products_List";
	}
	
	
	//商品按价格大小排序显示
	@RequestMapping("/queryItemsByPriceSize")
	public List<ShopinfoCustom> queryItemsByPriceSize(String pSize) throws Exception{
		
		if(pSize.equals("按从大到小排序")){
		return itemsService.queryItemsByPriceSize();
		}else{
			//按从小到大排序
			return itemsService.queryItemsByPriceSize2();
		}
		
		
		
	}
	
	//商品价格按区间筛选
	
	@RequestMapping("/queryItemsByBetweenSize")
	public String queryItemsByBetweenSize(Model model,ShopinfoQueryVo shopinfoQueryVo) throws Exception{
		List<ShopinfoCustom> shopinfoList=itemsService.queryItemsByBetweenSize(shopinfoQueryVo);
		model.addAttribute("itemsList", shopinfoList);
		return "Products_List";
		
		
		
	}
	
	/*//查询出所有商品的的类型
	@RequestMapping("/queryType")
	public String queryType(ShopinfoCustom shopinfoCustom,Model model){
		List<ShopinfoCustom> shopinfoList=itemsService.queryType(shopinfoCustom);
		model.addAttribute("itemsList", shopinfoList);
		return "Products_List";
		
		
	}*/
	
	/*//按类型进行查询
	@RequestMapping("/queryItemsByType")
	public String queryItemsByType(Model model,ShopinfoCustom shopinfoCustom){
		
		List<ShopinfoCustom> shopinfoList = itemsService.queryType(shopinfoCustom);
		
		model.addAttribute("itemsList", shopinfoList);
		return "Products_List";*/
				
}
