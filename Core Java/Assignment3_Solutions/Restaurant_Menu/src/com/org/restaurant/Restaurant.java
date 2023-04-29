package com.org.restaurant;

public class Restaurant {
	int dishid;
	String dishname;
	double dishprice;
	
	public Restaurant() {
		
	}
	
	public Restaurant(int dishid, String dishname, double dishprice) {
		
		this.dishid = dishid;
		this.dishname = dishname;
		this.dishprice = dishprice;
	}
	public int getDishid() {
		return dishid;
	}
	public void setDishid(int dishid) {
		this.dishid = dishid;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public double getDishprice() {
		return dishprice;
	}
	public void setDishprice(double dishprice) {
		this.dishprice = dishprice;
	}
	@Override
	public String toString() {
		return String.format("%-20d%-20s%-20f",this.dishid, this.dishname,this.dishprice);
	}
	
	
}
