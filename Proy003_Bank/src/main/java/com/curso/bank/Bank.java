package com.curso.bank;

public class Bank {

public static void main(String[] args) {
		
		Account cuenta1 = new Account(0);
		Customer c1 = new Customer("Oscar", "Torres");
		
		c1.setAccount(cuenta1);
		c1.getAccount().deposit(500);
		System.out.printf("\rCreando el cliente "+ 
				c1.getFirstName() + " " + c1.getLastName());
		System.out.printf("\rCreando su cuenta bancario con saldo "+ c1.getAccount().getBalance() + ".");

		System.out.printf("\rSacar 200: "+ c1.getAccount().withdraw(200));
		
		System.out.printf("\rIngresar 50: "+ c1.getAccount().deposit(50));
		System.out.printf("\rSacar 60: "+ c1.getAccount().withdraw(60));
		System.out.printf("\rSacar 700: "+ c1.getAccount().withdraw(700));

		System.out.printf("\rCustomer: ["+  c1.getFirstName() + ", "+ c1.getLastName() + "] tiene un saldo de: " + c1.getAccount().getBalance());
		System.out.println(" ");
	}
}
