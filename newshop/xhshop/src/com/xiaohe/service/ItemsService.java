package com.xiaohe.service;

import java.util.List;

import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryStore;
import com.xiaohe.po.ShopinfoQueryVo;
import com.xiaohe.po.Store;

public interface ItemsService {
	public void addItems(ShopinfoCustom shopinfoCustom) throws Exception;

	public List<ShopinfoCustom> queryAllItems() throws Exception;
	
	public void deleterItems(Integer id) throws Exception;

	public void updateItems(ShopinfoCustom shopinfoCustom) throws Exception;
	
	public List<ShopinfoCustom> searchItems(ShopinfoQueryVo shopinfoQueryVo) throws Exception;
	
	public List<ShopinfoCustom> queryItemsByType(ShopinfoQueryVo shopinfoQueryVo) throws Exception;

	public List<ShopinfoCustom> queryItemsByPriceSize() throws Exception;
	
	public List<ShopinfoCustom> queryItemsByPriceSize2() throws Exception;
	/**
	 * 新增
	 */
	//查询商品所有信息
	public List<ShopinfoQueryStore> SelectStoreAndshopinfo(ShopinfoQueryStore shopinfoQueryStore) throws Exception;
	//商品管理员修改库存
	public void updateStore(Store store) throws Exception;
}
