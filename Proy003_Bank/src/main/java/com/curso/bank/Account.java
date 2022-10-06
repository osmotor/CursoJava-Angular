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
		
		if(amt < 0) {
			throw new RuntimeException("Por favor, introduzca una cantidad permitida");
		}
		balance = balance + amt;
		return true;
	}
	
	public boolean withdraw(double amt) {
		
		boolean retirado = false; 
		
		if(amt < balance) {
			balance = balance - amt;
			retirado = true;
		}
		return retirado;
	}
	
}
