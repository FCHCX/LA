package com.xiaohe.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;




import com.xiaohe.mapper.ShopinfoMapper;
import com.xiaohe.mapper.ShopinfoMapperCustom;
import com.xiaohe.po.Shopinfo;
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
	@Override
	public void deletesingle(Integer items_id) {
		// TODO Auto-generated method stub
		shopinfoMapper.deleteByPrimaryKey(items_id);
	}
	@Override
	public ShopinfoCustom findItemsById(Integer items_id) {
		// TODO Auto-generated method stub
		Shopinfo shopinfo= shopinfoMapper.selectByPrimaryKey(items_id);
		/*ItemsCustom itemsCustom=null;
		if(items==null){
			throw new CustomException("您查询的商品信息不存在");
		}
		//为了让两者类型上不冲突  使用spring提供的BeanUtils拷贝方法
*/		ShopinfoCustom shopinfoCustom=null;
		if(shopinfo!=null){
			shopinfoCustom=new ShopinfoCustom();
			BeanUtils.copyProperties(shopinfo, shopinfoCustom);
		}
		
		return shopinfoCustom;
	}
	/*@Override
	//查出类型
	public List<ShopinfoCustom> queryType(ShopinfoCustom shopinfoCustom) {
		// TODO Auto-generated method stub
		return shopinfoMapperCustom.queryType(shopinfoCustom);
		
	}*/
	@Override
	public int queryItemsAllCount() throws Exception {
		// TODO Auto-generated method stub
		return shopinfoMapperCustom.queryItemsAllCount();
	}
	
	
}
