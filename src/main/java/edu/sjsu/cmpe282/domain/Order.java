package edu.sjsu.cmpe282.domain;

public class Order {

	private int prdBt;
	private int qtyBt;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPrdBt() {
		return prdBt;
	}
	public void setPrdBt(int prdBt) {
		this.prdBt = prdBt;
	}
	public int getQtyBt() {
		return qtyBt;
	}
	public void setQtyBt(int qtyBt) {
		this.qtyBt = qtyBt;
	}
	
	@Override
	public String toString() {
		return "Order [prdBt=" + prdBt + ", qtyBt=" + qtyBt + "]";
	}
	
	
}
