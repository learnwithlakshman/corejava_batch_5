package com.lwl.cj.day8;

public class Account {

	private String name;
	private double balance;

	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public void withDraw(double amount) throws InsufficientFundsException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdraw amount can'b zero or -ve number");
		} else if(amount > balance) {
			throw new InsufficientFundsException("Please check your balance");
		}
		this.balance -= amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
