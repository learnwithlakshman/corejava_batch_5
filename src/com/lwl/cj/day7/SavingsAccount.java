package com.lwl.cj.day7;

public class SavingsAccount extends Account {
	
	private double min_balance = 1000;
	public SavingsAccount(int accno, String name, double balance) {
		super(accno,name,balance);
		
	}
	public void withdraw(double amount) {
		if (amount <= balance - min_balance) {
			balance -= amount;
		}
		System.out.println("The current balance:" + balance);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Min Bal:"+min_balance);
	}

	
	
}
