package com.curso.bank;

public class Bank {

public static void main(String[] args) {
		
	Account cuenta1 = new Account(0);
	Customer c1 = new Customer("Rafa", "Antúnez");
	
	c1.setAccount(cuenta1);
	c1.getAccount().deposit(500);
	System.out.printf("\rCreando el cliente "+ 
			c1.getFirstName() + " " + c1.getLastName());
	System.out.printf("\rCreando su cuenta bancario con saldo "+ c1.getAccount().getBalance() + ".");

	System.out.printf("\rSacar 150.00: "+ c1.getAccount().withdraw(150));
	
	System.out.printf("\rIngresar 22.50: "+ c1.getAccount().deposit(22.50));
	System.out.printf("\rSacar 47.62: "+ c1.getAccount().withdraw(47.62));
	System.out.printf("\rSacar 400: "+ c1.getAccount().withdraw(400));

	System.out.printf("\rCustomer: ["+  c1.getFirstName() + ", "+ c1.getLastName() + "] tiene un saldo de: " + c1.getAccount().getBalance());
	System.out.println(" ");
	}
}
