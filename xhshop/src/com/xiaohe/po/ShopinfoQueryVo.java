package com.xiaohe.po;

import java.util.List;

public class ShopinfoQueryVo {
	private Shopinfo shopinfo;
	
	private List<ShopinfoCustom> shopinfoList;

	public Shopinfo getShopinfo() {
		return shopinfo;
	}

	@Override
	public String toString() {
		return "ShopinfoQueryVo [shopinfo=" + shopinfo + ", shopinfoList="
				+ shopinfoList + "]";
	}
	
	public void setShopinfo(Shopinfo shopinfo) {
		this.shopinfo = shopinfo;
	}

	public List<ShopinfoCustom> getShopinfoList() {
		return shopinfoList;
	}

	public void setShopinfoList(List<ShopinfoCustom> shopinfoList) {
		this.shopinfoList = shopinfoList;
	}
}
