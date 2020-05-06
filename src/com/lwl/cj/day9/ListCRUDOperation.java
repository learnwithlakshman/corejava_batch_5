package com.lwl.cj.day9;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListCRUDOperation {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> divisible5List = new LinkedList<Integer>();
		Random random = new Random();

		for (int i = 0; i <= 100; i++) {
			int num = random.nextInt(50) + 1;
			list.add(num);
		}
		
		// Display the numbers which are divisible by 5
		for(Integer ele:list) {
			if(ele % 5 == 0) {
				divisible5List.add(ele);
			}
		}
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) % 3 == 0) {
				list.set(i, 0);
			}
		}
		
		
		
		
		System.out.println(list);
		System.out.println(divisible5List);

		
	}
}
