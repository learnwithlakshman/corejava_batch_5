package com.lwl.ems.service;

import java.util.List;

import com.lwl.ems.dao.EmployeeDao;
import com.lwl.ems.dao.EmployeeDaoImpl;
import com.lwl.ems.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao;

	public EmployeeServiceImpl() {
		empDao = new EmployeeDaoImpl();
	}

	@Override
	public int addEmployee(Employee employee) {
		if(employee == null) {
			throw new IllegalArgumentException("Employee object can't be null");
			
		}
		return empDao.addEmployee(employee);
	}

	@Override
	public List<Employee> allEmployees() {
		List<Employee> list = empDao.allEmployees();
		return list;
	}

	@Override
	public int deleteEmployee(int empno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
