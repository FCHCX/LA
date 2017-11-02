package com.xiaohe.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaohe.mapper.ShopinfoMapper;
import com.xiaohe.mapper.ShopinfoMapperCustom;
import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;
import com.xiaohe.service.ItemsService;
public class ItemsServiceImpl implements ItemsService{
	

	@Autowired
	private ShopinfoMapperCustom shopinfoMapperCustom;
	@Override
	public void addItems(ShopinfoCustom shopinfoCustom) throws Exception{
		// TODO Auto-generated method stub
		shopinfoMapperCustom.addItems(shopinfoCustom);
	}
	@Autowired
	private ShopinfoMapper shopinfoMapper;
	@Override
	public void deleteItemsByMoreId(Integer[] items_id) throws Exception{
		// TODO Auto-generated method stub
		ShopinfoQueryVo shopinfoQueryVo=new ShopinfoQueryVo();
		List<Integer> ids= new ArrayList<Integer>();
		for (int i=0;i<items_id.length;i++) {
			ids.add(items_id[i]);
		}
		shopinfoQueryVo.setIds(ids);
		shopinfoMapperCustom.deleteItemsByMoreId(shopinfoQueryVo);
		
	}
	@Override
	public List<ShopinfoCustom> queryAllItems() throws Exception{
		// TODO Auto-generated method stub
	
		return shopinfoMapperCustom.queryAllItems();
	}
	@Override
	public void updateItems(ShopinfoCustom shopinfoCustom) throws Exception{
		// TODO Auto-generated method stub
		shopinfoMapper.updateByPrimaryKey(shopinfoCustom);
	}
	@Override
	public List<ShopinfoCustom> searchItems(ShopinfoQueryVo shopinfoQueryVo) throws Exception{
		// TODO Auto-generated method stub
		return shopinfoMapperCustom.searchItems(shopinfoQueryVo);
	}
	@Override
	public List<ShopinfoCustom> queryItemsByType(ShopinfoQueryVo shopinfoQueryVo) throws Exception{
		// TODO Auto-generated method stub
		
		return shopinfoMapperCustom.queryItemsByType(shopinfoQueryVo);
		
	}
	
	@Override
	public List<ShopinfoCustom> queryItemsByPriceSize() throws Exception {
		// TODO Auto-generated method stub
		return shopinfoMapperCustom.queryItemsByPriceSize();
		
	}
	@Override
	public List<ShopinfoCustom> queryItemsByPriceSize2() throws Exception {
		// TODO Auto-generated method stub
		return shopinfoMapperCustom.queryItemsByPriceSize2();
		
	}
	@Override
	public List<ShopinfoCustom> queryItemsByBetweenSize(ShopinfoQueryVo shopinfoQueryVo) {
		// TODO Auto-generated method stub
		return shopinfoMapperCustom.queryItemsByBetweenSize(shopinfoQueryVo);
		
		
	}
	
	
}
