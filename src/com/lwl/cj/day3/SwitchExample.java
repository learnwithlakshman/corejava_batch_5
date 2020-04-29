package com.lwl.cj.day3;

import java.util.Scanner;

public class SwitchExample {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			int num = sc.nextInt();
			
			for(int i=1;i<=20;i++) {
				
				if(i % 5 == 0)
					continue;
				System.out.println(i);
				
			}
			
			switch (num) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Value is > 3");
				break;
			}
			sc.close();
		}
}
