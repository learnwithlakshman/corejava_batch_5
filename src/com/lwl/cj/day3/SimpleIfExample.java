package com.lwl.cj.day3;

import java.util.Scanner;

public class SimpleIfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		float bill_amount = sc.nextFloat();
		float discount = 0;

		if (bill_amount > 5000) {
			discount = bill_amount * 0.1f;
		}

		float net_amount = bill_amount - discount;
		System.out.println("Bill amount :" + bill_amount);
		System.out.println("Discount :" + discount);
		System.out.println("Net amount :" + net_amount);
		sc.close();

	}
}
