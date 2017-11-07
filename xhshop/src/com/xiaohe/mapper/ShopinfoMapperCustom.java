package com.xiaohe.mapper;

import java.util.List;

import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;

public interface ShopinfoMapperCustom {
	public void addItems(ShopinfoCustom shopinfoCustom) throws Exception;
	
	public List<ShopinfoCustom> queryAllItems() throws Exception;
	
	public List<ShopinfoCustom> searchItems(ShopinfoQueryVo shopinfoQueryVo) throws Exception;
//	public void updateItems (Integer id);
	public List<ShopinfoCustom> queryItemsByType(ShopinfoQueryVo shopinfoQueryVo) throws Exception;
	
	public List<ShopinfoCustom> queryItemsByPriceSize() throws Exception;
	
	public List<ShopinfoCustom> queryItemsByPriceSize2() throws Exception;
	
	public List<ShopinfoCustom> queryItemsByBetweenSize(ShopinfoQueryVo shopinfoQueryVo);
	
	 public void deleteItemsByMoreId(ShopinfoQueryVo shopinfoQueryVo)throws Exception;
	public List<ShopinfoCustom> queryType(ShopinfoCustom shopinfoCustom);

	public int queryItemsAllCount()throws Exception;
	
}
