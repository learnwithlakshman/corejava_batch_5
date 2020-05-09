package com.lwl.cj.day10;

import java.util.HashMap;
import java.util.Map;

public class WordCountUsingMap {
	public static void main(String[] args) {

		String data = "java,java,fun,learning,java,python,php,mongodb,java,mongodb,java,mongodb,python,fun,julia,julia";
		String[] arr = data.split(",");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String ele : arr) {
			if (map.get(ele) == null) {
				map.put(ele, 1);
			} else {
				map.put(ele, map.get(ele) + 1);
			}
		}
		
		map.entrySet().forEach((ele)->{
			System.out.println(ele.getKey().toUpperCase()+"   :"+ele.getValue());
		});

	}
}
