package com.lwl.cj.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1001);
		list.add(1002);
		list.add(1008);
		list.add(1010);
		list.add(1001);
		list.add(1002);

		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(1));
		System.out.println(list.contains(1002));
		System.out.println("------------- List Elements-----------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------Reverse of List Elements-----------");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------Using java8 processing list elements---------------");
		list.stream().forEach(System.out::println);
		
		System.out.println("-------------Using Iterator-----------------------------");
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer ele = iterator.next();
			System.out.println(ele);
		}
		
		System.out.println("------------ List Iterator-----------------------------------");
		ListIterator<Integer> listItr = list.listIterator();
		while(listItr.hasNext()) {
			Integer ele = listItr.next();
			System.out.println(ele);
		}
		System.out.println("-------------Backward Direction----------------");
		while(listItr.hasPrevious()) {
			Integer ele = listItr.previous();
			System.out.println(ele);
		}
		System.out.println("--------------- using for-each loops -----------------");
		for(Integer ele:list) {
			System.out.println(ele);
		}
	}
}
