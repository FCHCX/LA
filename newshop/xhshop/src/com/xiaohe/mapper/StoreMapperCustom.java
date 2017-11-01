package com.xiaohe.mapper;

import java.util.List;

import com.xiaohe.po.ShopinfoQueryStore;
import com.xiaohe.po.Store;

public interface StoreMapperCustom {
    //商品管理员查询所有商品信息
	public List<ShopinfoQueryStore> QueryAllShopinfo() throws Exception;

	public void updateStore(Store store) throws Exception;

}
