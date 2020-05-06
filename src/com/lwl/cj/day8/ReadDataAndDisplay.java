package com.lwl.cj.day8;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class MyClass implements Closeable {

	String shortName(String name) {
		return name.substring(0, 3).toUpperCase();
	}

	void show(String name) {
		System.out.println("Hello " + shortName(name));
	}

	@Override
	public void close() throws IOException {
		System.out.println("MyClass is closed now....");
	}
}

public class ReadDataAndDisplay {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader(new File("data.txt")); BufferedReader br = new BufferedReader(fr);) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("Please check input file:" + e);
		}

		try (MyClass obj = new MyClass()) {
			obj.show("CV");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
