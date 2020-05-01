package com.lwl.cj.day5;

public class Manager {
	public static void main(String[] args) {
		Student obj1 = new Student(1005, "Krish", 6);
		Student obj2 = new Student(1002, "Manoj", 5);
		Student obj3 = new Student(1005, "Balu", 7);
		Student obj4 = new Student(1008, "Rajesh", 5);
		Student obj5 = new Student(1009, "Ramana", 7);
		Student stu1 = new Student(1010, "Kiran", 5);
		Student stu2 = new Student(1011, "Mahesh", 5);
		Student stu3 = new Student(1009, "Tanvi");

		
		Student[] arr = { obj1, obj2, obj3, obj4, obj5, stu1, stu2,stu3 };
		
		for (Student stu : arr) {
			if(stu.getName().equals("Tanvi")) {
				stu.incrementSection(2);
			}

		}
		
		
		for(Student stu:arr) {
			stu.showDetails();
			System.out.println("---------------");
		}
		
		
		
		
		

	}
}
