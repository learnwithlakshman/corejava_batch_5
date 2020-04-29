package com.lwl.cj.day3;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		boolean flag = true;
		
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				System.out.println(i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println(num +" has no factors b'coz it is prime");
		}
		sc.close();
	}
}
