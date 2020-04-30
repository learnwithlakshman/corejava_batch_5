package com.lwl.cj.day4;

public class StringExample {
	public static void main(String[] args) {
		String name1 = "Core";
		String name2 = "Core";
		String name3 = new String("Core");
		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		System.out.println(name2.equals(name3));
	}
}
