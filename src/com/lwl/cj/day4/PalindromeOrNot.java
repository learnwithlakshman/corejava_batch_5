package com.lwl.cj.day4;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();

		boolean flag = true;
		for (int i = 0, j = name.length() - 1; i <= j; i++, j--) {
			if (name.charAt(i) != name.charAt(j)) {
				System.out.println("It is not a palindrome");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("It is a palindrome");
		}

		String rev_name =  new StringBuffer(name).reverse().toString();
		if (name.equals(rev_name)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		sc.close();
	}
}
