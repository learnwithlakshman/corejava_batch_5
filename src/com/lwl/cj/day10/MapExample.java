package com.lwl.cj.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1001, "Krish");
		map.put(1009,"Manoj");
		map.put(1010, "Rajesh");
		map.put(1001, "Raj");
		
		System.out.println(map);
		
		System.out.println(map.get(1010));
		System.out.println(map.get(1090));
		
		Set<Integer> set = map.keySet();
		for(Integer key :set) {
			System.out.println(key+" "+map.get(key));
		}
		
		
	}
}
