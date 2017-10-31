package com.xiaohe.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.xiaohe.po.ShopinfoQueryStore;
import com.xiaohe.po.Store;
@Transactional
public interface ItemsService {
	
	//查询商品所有信息
	public List<ShopinfoQueryStore> SelectStoreAndshopinfo(ShopinfoQueryStore shopinfoQueryStore);
	//商品管理员修改库存
	public void updateStore(Store store);

	public ShopinfoQueryStore oneShopinfoQueryStore(int id)throws Exception ;
	
	
	
}

