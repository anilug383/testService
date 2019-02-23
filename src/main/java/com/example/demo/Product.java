package com.example.demo;

public class Product {
	
	private int id;
	private String productTitle;
	private String productDiscount;
	private String productOriginalPrice;
	private String productDiscountPrice;
	private String imageSrc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(String productDiscount) {
		this.productDiscount = productDiscount;
	}
	public String getProductOriginalPrice() {
		return productOriginalPrice;
	}
	public void setProductOriginalPrice(String productOriginalPrice) {
		this.productOriginalPrice = productOriginalPrice;
	}
	public String getProductDiscountPrice() {
		return productDiscountPrice;
	}
	public void setProductDiscountPrice(String productDiscountPrice) {
		this.productDiscountPrice = productDiscountPrice;
	}
	public String getImageSrc() {
		return imageSrc;
	}
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	public Product(int id, String productTitle, String productDiscount, String productOriginalPrice,
			String productDiscountPrice, String imageSrc) {
		super();
		this.id = id;
		this.productTitle = productTitle;
		this.productDiscount = productDiscount;
		this.productOriginalPrice = productOriginalPrice;
		this.productDiscountPrice = productDiscountPrice;
		this.imageSrc = imageSrc;
	}
	
	
	

}
