package com.lwl.cj.day8;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		System.out.println("Start of Main");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the num1:");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2:");
			int num2 = sc.nextInt();
			try {
				int res = num1 / num2;
				System.out.println("Result is :" + res);
			} catch (ArithmeticException e) {
				System.out.println("Num2 value can't zero:" + e);
			}
			System.out.println("Do you want to continue... yes or no?");
			sc.nextLine();
			String ch = sc.nextLine();
			if(!ch.equals("yes"))
				break;
		}
		sc.close();
		System.out.println("End of Main");
	}
}
