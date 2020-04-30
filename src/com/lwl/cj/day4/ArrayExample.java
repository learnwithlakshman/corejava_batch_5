package com.lwl.cj.day4;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 25, 50, 1, 3, 7, 9, 18 };
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		float avg = sum / arr.length;
		System.out.println("The sum is :"+sum);
		System.out.println("The average is:"+avg);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search :");
		int key = sc.nextInt();
		
		boolean isFound = false;
		
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			if(num == key) {
				System.out.println(key+" is found at location "+i);
				isFound = true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println(key+" is not found in the given array");
		}
		sc.close();
		
		
		
		
		
		
	}
}
