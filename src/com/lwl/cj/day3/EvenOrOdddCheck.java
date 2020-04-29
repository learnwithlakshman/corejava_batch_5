package com.lwl.cj.day3;

import java.util.Scanner;

public class EvenOrOdddCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("The given number " + num + " is even");
		} else {
			System.out.println("The given number " + num + " is odd");
		}
		sc.close();
	}
}
