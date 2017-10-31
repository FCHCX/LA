package com.xiaohe.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaohe.mapper.StoreMapper;
import com.xiaohe.mapper.StoreMapperCustom;
import com.xiaohe.po.ShopinfoQueryStore;
import com.xiaohe.po.Store;
import com.xiaohe.service.ItemsService;
public class ItemsServiceImpl implements ItemsService{

	@Autowired
	private StoreMapper storeMapper;
	
	private StoreMapperCustom storeMapperCustom;
	@Override
	public void updateStore(Store store) {
		// TODO Auto-generated method stub
		 storeMapperCustom.updateStore(store);
	}

	//private StoreMapperCustom storeMapperCustom ;
	@Override
	public List<ShopinfoQueryStore> SelectStoreAndshopinfo(
			ShopinfoQueryStore shopinfoQueryStore) {
		// TODO Auto-generated method stub
		
		
		return storeMapperCustom.QueryAllShopinfo();
	}

	@Override
	public ShopinfoQueryStore oneShopinfoQueryStore(int id) throws Exception {
		
		return null;
	}
	
	
}
