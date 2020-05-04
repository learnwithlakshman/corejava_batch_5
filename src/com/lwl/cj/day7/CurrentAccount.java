package com.lwl.cj.day7;

public class CurrentAccount extends Account {
	
	private double over_draft = 10000;
	public CurrentAccount(int accno, String name, double balance) {
		super(accno,name,balance);
		
	}
	public void withdraw(double amount) {
		if (amount <= balance + over_draft) {
			balance -= amount;
		}
		System.out.println("The current balance:" + balance);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Overdraft:"+over_draft);
	}

	
	
}
