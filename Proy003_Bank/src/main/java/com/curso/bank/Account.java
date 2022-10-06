package com.curso.bank;

public class Account {

	private double balance ;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	


	public boolean deposit(double amt) {
		return  true;
	}
	
	public boolean withdraw(double amt) {
		return  true;
	}
	
}
