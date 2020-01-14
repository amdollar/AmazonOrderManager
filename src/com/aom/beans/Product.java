package com.aom.beans;

public class Product {
	private String productName;
	private int productQuantity;
	private int productPrice;

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public int getProductPrice() {
		return productPrice;
	}

}
