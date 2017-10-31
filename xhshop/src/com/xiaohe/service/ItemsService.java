package com.xiaohe.service;

import java.util.List;

import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;

public interface ItemsService {
	public void addItems(ShopinfoCustom shopinfoCustom) throws Exception;

	public List<ShopinfoCustom> queryAllItems() throws Exception;
	
	public void deleterItems(Integer id) throws Exception;

	public void updateItems(ShopinfoCustom shopinfoCustom) throws Exception;
	
	public List<ShopinfoCustom> searchItems(ShopinfoQueryVo shopinfoQueryVo) throws Exception;
	
	public List<ShopinfoCustom> queryItemsByType(ShopinfoQueryVo shopinfoQueryVo) throws Exception;

	public List<ShopinfoCustom> queryItemsByPriceSize() throws Exception;
	
	public List<ShopinfoCustom> queryItemsByPriceSize2() throws Exception;
}
