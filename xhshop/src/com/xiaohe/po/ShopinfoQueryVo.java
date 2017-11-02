package com.xiaohe.po;

import java.util.List;

public class ShopinfoQueryVo {
	private Shopinfo shopinfo;
	private List<Integer> ids;
	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	private ShopinfoCustom shopinfoCustom;
	public ShopinfoCustom getShopinfoCustom() {
		return shopinfoCustom;
	}

	public void setShopinfoCustom(ShopinfoCustom shopinfoCustom) {
		this.shopinfoCustom = shopinfoCustom;
	}

	//价格左右区间
	private String left;
	private String right;
	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

	private List<ShopinfoCustom> shopinfoList;

	public Shopinfo getShopinfo() {
		return shopinfo;
	}

	@Override
	public String toString() {
		return "ShopinfoQueryVo [shopinfo=" + shopinfo + ", ids=" + ids
				+ ", shopinfoCustom=" + shopinfoCustom + ", left=" + left
				+ ", right=" + right + ", shopinfoList=" + shopinfoList + "]";
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
