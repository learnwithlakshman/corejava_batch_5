package com.lwl.cj.day4;

public class StringMethods {
	public static void main(String[] args) {
		String name = " Core Java ";
		System.out.println(name.trim().length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim().substring(0, 3));
		
		String message = name.trim().concat(" learning is fun!");
		System.out.println(message);
		System.out.println(name);
		
	}
}
