package com.lwl.cj.day7;

public class Account {

	 int accno;
	 String name;
	 double balance;
	 
	
	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
		System.out.println("The current balance:" + balance);
	}

	public void deposite(double amount) {
		balance += amount;
		System.out.println("The current balance:" + balance);
	}

	public void showInfo() {
		System.out.println("Accno :" + accno);
		System.out.println("Name :" + name);
		System.out.println("Balance :" + balance);
	}

}
