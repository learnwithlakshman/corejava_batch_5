package com.lwl.cj.day10;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		EmployeeService obj = new EmployeeService();
		obj.showEmployeeDetails();
		String dname = "DEV";
		double org_total_sal = obj.totalSalaryPaid();
		double dept_total_sal = obj.totalSalaryPaid(dname);
		System.out.println("Org  total salary is:"+org_total_sal);
		System.out.println("For "+dname+" total Salary is: "+dept_total_sal);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to search:");
		String name = sc.nextLine();
		obj.search(name);
		sc.close();
		
	}
}

