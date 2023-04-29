package com.org.logic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class CheckingAccount extends Account {

	@Getter @Setter private double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance,double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit=overdraftLimit;
		
	}
	
	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return this.getBalance()-amount;
	}
	
	
	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return this.getBalance()+amount;
	}
	
	
}
