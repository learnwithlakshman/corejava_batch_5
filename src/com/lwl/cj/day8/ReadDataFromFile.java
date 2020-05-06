package com.lwl.cj.day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("data.txt"));
			while(sc.hasNextLine()) {
				String name = sc.nextLine();
				System.out.println(name);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
