package com.lwl.cj.day6;

class NumberOpertions extends Object{

	public int add(int a, int b) {
		System.out.println("The method is called with two params");
		return a + b;
	}

	public int add(int a, int b, int c) {
		System.out.println("The method is called with three params");
		return a + b + c;
	}

	public int add(int... arr) {
		System.out.println("The method is called with varargs params");
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		return sum;
	}

	public int biggest(int a, int b) {
		System.out.println("The method is called with two params");
		return a > b ? a : b;
	}

	public int biggest(int a, int b, int c) {
		System.out.println("The method is called with three params");
		return a > b && a > c ? a : b > c ? b : c;
	}

	public int biggest(int... arr) {
		System.out.println("The method is called with varargs params");
		int big = arr[0];
		for (int ele : arr) {
			if (big < ele)
				big = ele;

		}
		return big;
	}

	public void combined(float a, String s, int... args) {

	}

	public void combined(int... args) {

	}

}

public class VarargsLengthExample {
	public final static void main(final String... args) {
		NumberOpertions obj = new NumberOpertions();
		
		
		int res = obj.biggest(10, 20, 30, 50, 20, 90, 110, 40, 50);
		System.out.println(res);

	}
}
