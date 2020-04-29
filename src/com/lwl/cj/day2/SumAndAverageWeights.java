package com.lwl.cj.day2;

import java.util.Scanner;

public class SumAndAverageWeights {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of person1: ");
		float weight_1 = sc.nextFloat();
		System.out.println("Enter the weight of person2: ");
		float weight_2 = sc.nextFloat();
		System.out.println("Enter the weight of person3: ");
		float weight_3 = sc.nextFloat();
		
		float sum_weight = weight_1 + weight_2 + weight_3;
		float avg_weight = sum_weight / 3;
		
		System.out.println("The sum of weights is :"+sum_weight);
		System.out.println("The average weight is :"+avg_weight);
		
		sc.close();
	}
}
