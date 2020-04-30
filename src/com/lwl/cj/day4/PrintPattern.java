package com.lwl.cj.day4;

public class PrintPattern {
	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 }};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] == 1) {
					System.out.print("@");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
