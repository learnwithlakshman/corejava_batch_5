package com.lwl.cj.day10;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Krish");
		set.add("Charan");
		set.add("Manoj");
		set.add("Charan");
		set.add("Manoj");
		set.add("Balu");
		set.add("Kiran");
		
		
		System.out.println(set.size());
		System.out.println(set);
	}
}
