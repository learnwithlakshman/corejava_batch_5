package com.lwl.cj.day6;

public final class MathOperations {

	private MathOperations() {

	}

	public static int factorial(int num) {
		if (num == 0 || num == 1)
			return 1;
		int res = 1;
		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		return res;
	}
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		for(int i=2;i<=(int)Math.sqrt(num);i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
}
