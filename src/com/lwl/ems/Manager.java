package com.lwl.ems;

import java.util.List;
import java.util.Scanner;

import com.lwl.ems.domain.Employee;
import com.lwl.ems.service.EmployeeService;
import com.lwl.ems.service.EmployeeServiceImpl;

public class Manager {
	public static void main(String[] args) {
		EmployeeService emp = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.Add 2. View all 3. Update 4. Search 5.Delete 6.exit");
			System.out.println("-----------------------------------------------------------");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				Employee employee = getEmployeeFromUserInput();
				int res = emp.addEmployee(employee);
				if(res>0) {
					System.out.println("Employee is added ...");
				}else {
					System.out.println("Something went wrong while adding employee");
				}
				break;
			case 2:
				List<Employee> list = emp.allEmployees();
				paintEmployees(list);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Enter valid choice:(1-6) only");
			}
			
			System.out.println("Do you want to continue... Y/N");
			sc.nextLine();
			String choice = sc.nextLine();
			if(!choice.equals("Y")) {
				System.out.println("Thank you... we are done with it");
				System.exit(0);
			}
			
		}
		
	}

	private static Employee getEmployeeFromUserInput() {
		//Code accept user input
		Employee emp = new Employee();
		emp.setEmpno(13);
		emp.setName("Naresh");
		emp.setDname("QA");
		emp.setSalary(66787);
		return emp;
	}

	private static void paintEmployees(List<Employee> list) {
			list.forEach(e->{
				System.out.println(e);
			});
	}
}
