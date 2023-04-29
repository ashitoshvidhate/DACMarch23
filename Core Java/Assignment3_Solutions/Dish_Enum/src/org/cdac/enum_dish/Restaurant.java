package org.cdac.enum_dish;

enum dish{
	dish1("Chineese",230),dish2("Kolhapuri Non-veg",300),dish3("Puran Poli",320),dish4("Mixed Vegetables",180);
	
	private String dishname;
	private double price;
	
	dish(String dishname,double price) {
		this.dishname=dishname;
		this.price=price;
	}
	
	public String getDishName() {
		return this.dishname;
	}
	public double getDishPrice() {
		return this.price;
	}
	
	public String toString() {
		return String.format("%-20s%-20s", this.dishname,this.price);
	}
}
public class Restaurant {

	private static dish MenuList() {
		System.out.println("1.Print Menu of dish");
		System.out.println("2.Order dish");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
