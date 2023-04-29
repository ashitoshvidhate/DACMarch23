package com.org.test;

import java.util.Scanner;

import com.org.logic.Account;
import com.org.logic.CheckingAccount;
import com.org.logic.SavingsAccount;

public class AccountTest {
	
	private Account arr[]=new Account[2];
	
	public AccountTest() {
		arr[0]=new SavingsAccount();
		arr[1]=new CheckingAccount(); 
	}
	
	private static Scanner sc=new Scanner(System.in);
	
	public void acceptRecord() {
		for(int index=0;index<arr.length;index++) {
			System.out.println("Enter Account Number :");
			this.arr[index].setAccountNumber(sc.nextLine());
			System.out.println("Enter balance amount :");
			this.arr[index].setBalance(sc.nextDouble());
			
			if(this.arr[index] instanceof SavingsAccount) {
				SavingsAccount saccount=(SavingsAccount)arr[index];
				System.out.println("Enter interest Rate");
				saccount.setInterestRate(sc.nextDouble());
				
			}
				
			}
	}
}

