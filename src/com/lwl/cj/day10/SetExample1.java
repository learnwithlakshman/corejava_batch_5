package com.lwl.cj.day10;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample1 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(new File("data.txt"))){
			Set<String> set = new HashSet<String>();
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				set.add(line.trim());
			}
			System.out.println(set);
			System.out.println("Size :"+set.size());
			set.stream().forEach(System.out::println);
			System.out.println("Names which starts with R :");
			for(String name:set) {
				if(name.startsWith("R")) {
					System.out.println(name);
				}
			}
			System.out.println("Names which start with R using streams:");
			set.stream()
			   .filter(e->e.startsWith("R"))
			   .forEach(System.out::println);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
