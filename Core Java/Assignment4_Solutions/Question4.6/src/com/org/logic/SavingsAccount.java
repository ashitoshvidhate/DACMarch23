package com.org.logic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class SavingsAccount extends Account {
	
	@Getter @Setter private double interestRate;
	public SavingsAccount(String accountNumber, double balance,double interestRate) {
		super(accountNumber, balance);
		this.interestRate=interestRate;
		// TODO Auto-generated constructor stub
	}
	
	public void calculateInterest(int year,int rate) {
		double interest=this.getBalance()*year*rate;
		System.out.println("Interset  = "+interest);
		
	}
	
	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return this.getBalance()+amount;
	}
	
	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return this.getBalance()-amount;
	}

	
	
	

}
