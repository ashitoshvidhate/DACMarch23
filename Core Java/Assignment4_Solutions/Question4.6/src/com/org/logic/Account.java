package com.org.logic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	
	
	private String accountNumber;
	private double balance;

	public double deposit(double amount) {
		return this.balance=this.balance+amount;
	}
	
	public double withdraw(double amount) {
		return this.balance=this.balance-amount;
	}
	
}
