package com.lwl.cj.day10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetExample2 {
	public static void main(String[] args) {

		List<String> EC = Stream.of("ALN", "GLN", "MVR", "KVR").collect(Collectors.toList());
		List<String> CS = Stream.of("MVR", "GLN", "LVR", "KVR").collect(Collectors.toList());
		List<String> IS = Stream.of("PLN", "GLN", "MVR").collect(Collectors.toList());
		
		Set<String> all_faculty = new HashSet<String>();
		all_faculty.addAll(EC);
		all_faculty.addAll(CS);
		all_faculty.addAll(IS);
		
		System.out.println(all_faculty);
		System.out.println("Total faculties :"+all_faculty.size());
		

	}
}
