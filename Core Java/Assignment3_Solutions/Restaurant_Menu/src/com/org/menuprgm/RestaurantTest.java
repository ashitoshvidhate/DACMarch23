package com.org.menuprgm;

import java.util.Arrays;

import com.org.restaurant.Restaurant;

public class RestaurantTest {
	private int index;
	private Restaurant rt[];

	public RestaurantTest() {

	}

	public RestaurantTest(int capacity) {
		this.rt = new Restaurant[capacity];
	}

	// add new dish method
	public void addNewDishDetails(Restaurant rest) {
		if (index < this.rt.length) {
			this.rt[index] = rest;
			index = index + 1;
		}
	}

	// find dish method
	public Restaurant findDish(int dishid) {
		for (Restaurant rt : this.rt) {
			if (rt.getDishid() == dishid) {
				return rt;
			}
		}
		return null;
	}

	public boolean removeDishDetails(int dishid) {
		for (int index = 0; index < rt.length; index++) {
			if ((this.rt[index] != null) && this.rt[index].getDishid() == dishid) {
				this.rt[index] = null;
				return true;
			}
		}
		return false;
	}

	public void showAllDishes() {
		for(int index=0;index<rt.length;index++) {
			if(this.rt[index]!=null) {
				//System.out.println(rt);
				System.out.println(Arrays.toString(rt));
			}
		}
	}

	public void updateDishDetails(int dishid, double price) {
		for (Restaurant rt : this.rt) {
			if ((this.rt[index] != null) && (this.rt[index].getDishid() == dishid)) {
				rt.setDishprice(price);
				System.out.println("New updated Price successfully");
			}
		}
		
	}
}
