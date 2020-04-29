package com.lwl.cj.day3;

public class MultiplicationOfTable {
	public static void main(String[] args) {


		for (int j = 1; j <= 20; j++) {
			int num = j;
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			System.out.println("..........................");
		}
	
	}
}
