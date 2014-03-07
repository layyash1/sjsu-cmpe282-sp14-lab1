package edu.sjsu.cmpe282.domain;

public class Product {
	
	
	private int prodId;
	private String name;
	private String desc;
	private double price;
	private int qty;
	
	public Product(){
		super();		
	}
	
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int i) {
		this.qty = i;
	}
	
	public String toString(){
		 String prod = new StringBuffer("Product Id:").append(this.prodId).
				 append(" name:").append(this.name).append(" desc:").
				 append(this.desc).append(" Price:").append(this.price).append("  Qty:").append(this.qty).toString();
		 
		 return prod;
	}
	

}
