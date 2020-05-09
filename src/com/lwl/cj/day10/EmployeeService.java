package com.lwl.cj.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
	private static final List<Employee> EMP_LIST;
	static {
		EMP_LIST = new ArrayList<Employee>();
		try (Stream<String> lines = Files.lines(Paths.get("emp.txt"))) {
			lines.forEach(line -> {
				String[] arr = line.split(",");
				int empno = Integer.parseInt(arr[0]); // "1001" to number from string
				String ename = arr[1];
				String dname = arr[2];
				double salary = Double.parseDouble(arr[3]);
				Employee emp = new Employee(empno, ename, dname, salary);
				EMP_LIST.add(emp);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showEmployeeDetails() {
		showEmpList(EMP_LIST);
	}

	public double totalSalaryPaid(String dname) {
		double total_amount = EMP_LIST.stream().filter(e -> e.getDname().equals(dname)).mapToDouble(e -> e.getSalary())
				.sum();
		return total_amount;
	}

	public double totalSalaryPaid() {
		double total_amount = EMP_LIST.stream().mapToDouble(e -> e.getSalary()).sum();
		return total_amount;
	}

	public void search(String str) {
		List<Employee> list = EMP_LIST.stream().filter(e -> e.getEname().toLowerCase().contains(str.toLowerCase()))
				.collect(Collectors.toList());

		if (list.isEmpty()) {
			System.out.println("With given name :" + str + " no match found");
		} else {
			System.out.println("The matched name are :");
			showEmpList(list);
		}

	}

	private void showEmpList(List<Employee> list) {
		list.stream().forEach(e -> {
			System.out.println("Empno : " + e.getEmpno());
			System.out.println("Ename : " + e.getEname());
			System.out.println("Dname : " + e.getDname());
			System.out.println("Salary: " + e.getSalary());
			System.out.println("--------------------------");
		});
	}

}
