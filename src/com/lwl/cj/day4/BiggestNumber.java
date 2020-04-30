package com.lwl.cj.day4;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " value:");
			arr[i] = sc.nextInt();
		}

		int big = arr[0];
		int small = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if(big < arr[i]) {
				big = arr[i];
			}
			if(small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Biggest is:"+big);
		System.out.println("Smallest is:"+small);
		sc.close();

	}
}
