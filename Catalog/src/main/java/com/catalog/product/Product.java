package com.catalog.product;

public class Product {
	
	private String name, prodCat;
	private int price, prodId;
	public Product(String name, String prodCat, int price, int prodId) {
		super();
		this.name = name;
		this.prodCat = prodCat;
		this.price = price;
		this.prodId = prodId;
	}
	public Product(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCat() {
		return prodCat;
	}
	public void setCat(String prodCat) {
		this.prodCat = prodCat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

}
