package com.lwl.cj.day5;

public class Student {

	private int regno;
	private String name;
	private int std;
	
	public Student(int regno, String name, int std) {
		this.regno = regno;
		this.name = name;
		this.std = std;
	}
	public Student(int regno, String name) {
		this.regno = regno;
		this.name = name;
		this.std = 1;
	}

	public void incrementSection() {
		std++;
	}
	public void incrementSection(int num) {
		std +=num;
	}

	public void showDetails() {
		System.out.println("Reg no:" + regno);
		System.out.println("Name :" + name);
		System.out.println("Std :" + std);
	}

	
	public void setRegno(int regno) {
		this.regno = regno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public int getRegno() {
		return regno;
	}

	public String getName() {
		return name;
	}

	public int getStd() {
		return std;
	}
	
	

}
