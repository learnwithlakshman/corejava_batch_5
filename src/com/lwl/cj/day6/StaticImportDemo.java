package com.lwl.cj.day6;
import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

public class StaticImportDemo {
	static {
		System.out.println("This static block -1 ");
	}
	public static void main(String[] args) {
		out.println(PI);
		out.println(sqrt(9));
		out.println(max(8, 9));
		out.println(sin(60));
	}
	static {
		System.out.println("This is static block -2");
	}
}
