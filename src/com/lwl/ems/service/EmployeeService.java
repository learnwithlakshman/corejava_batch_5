package com.lwl.ems.service;

import java.util.List;

import com.lwl.ems.domain.Employee;

public interface EmployeeService {

		public int addEmployee(Employee employee);
		public List<Employee> allEmployees();
		public int deleteEmployee(int empno);
		public int updateEmployee(Employee employee);
		public List<Employee> search(String str);
}
