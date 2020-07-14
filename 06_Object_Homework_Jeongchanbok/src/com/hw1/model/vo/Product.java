package com.hw1.model.vo;

public class Product {

	// �ʵ��
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	//�����ں�
	public Product() {
		
		
	}
	
	public Product(String productId,String productName,String productArea,int price,double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
		
	}
	
	// setter �޼ҵ�
	public void setProdcutid(String productId) {
		this.productId = productId;
	}
	
	public void setProductname(String productName) {
		this.productName = productName;
	}
	
	public void setProdcutarea(String productArea) {
		this.productArea = productArea;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	// getter �޼ҵ�
	
	public String getProductid() {
		return productId;
	}
	
	public String getProductname() {
		return productName;
	}
	
	public String getProductarea() {
		return productArea;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getTax() {
		return tax;
	}
	
	
	// �޼ҵ��
	public String information() {
		return productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}
	
	public int realPrice(int price, double tax) {
		return price + (int)(price * tax);
	}
}
