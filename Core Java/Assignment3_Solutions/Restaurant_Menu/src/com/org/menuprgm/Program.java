package com.org.menuprgm;

import java.util.Scanner;

import com.org.restaurant.Restaurant;

public class Program {
	static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(Restaurant rt) {
		System.out.println("Enter dish id :");
		rt.setDishid(sc.nextInt());
		System.out.println("Enter dish name:");
		sc.nextLine();
		rt.setDishname(sc.nextLine());
		System.out.println("Enter dish price :");
		rt.setDishprice(sc.nextDouble());
	}

	private static void printAllDishes(Restaurant rt) {
		System.out.println(rt.toString());
	}

	public static char MenuList() {
		System.out.println("a.View the current Menu with prices :");
		System.out.println("b.Add a new dish to the menu :");
		System.out.println("c.Remove a dish from the menu : ");
		System.out.println("d.Modify the price of a dish on the menu");
		System.out.println("e.Exit program:");
		return sc.next().charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		RestaurantTest rtest=new RestaurantTest(size);
		while ((choice = Program.MenuList() )!= 'e') {
			switch(choice) {
			
			case 'a':
				rtest.showAllDishes();
				break;
			case 'b':
				Restaurant rt=new Restaurant();
				Program.acceptRecord(rt);
				rtest.addNewDishDetails(rt);
				break;
			case 'c':
				//sc.nextLine();
				System.out.println("Enter dishid :");
				
				boolean removestatus = rtest.removeDishDetails(sc.nextInt());
				System.out.println(removestatus ? "Removed dish successfully ":"Dish not found");
				break;
			case 'd':
				System.out.println("Enter dishid :");
				int x = sc.nextInt();
				System.out.println("Enter new price :");
				double newprice=sc.nextDouble();
				rtest.updateDishDetails(x,newprice);
				break;
			
				
				
			
				
			}
		}

	}

}
