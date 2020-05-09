package com.lwl.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lwl.ems.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final String ALL_EMPLOYEES = "select empno,ename,dname,salary from employee";
	private static final String ADD_EMPLOYEE = "insert into employee(empno,ename,dname,salary) values(?,?,?,?)";

	@Override
	public int addEmployee(Employee employee) {
		int res = -1;
		try (Connection con = ConnectionUtil.getConnection();
				PreparedStatement pst = con.prepareStatement(ADD_EMPLOYEE);) {
				pst.setInt(1, employee.getEmpno());
				pst.setString(2, employee.getName());
				pst.setString(3, employee.getDname());
				pst.setDouble(4, employee.getSalary());
				
				res = pst.executeUpdate();

		} catch (SQLException e) {
			System.out.println("While adding employee :" + e);
		}

		return res;
	}

	@Override
	public List<Employee> allEmployees() {
		List<Employee> empList = new ArrayList<Employee>();
		try (Connection con = ConnectionUtil.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(ALL_EMPLOYEES);) {

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String name = rs.getString("ename");
				String dname = rs.getString("dname");
				double salary = rs.getDouble("salary");
				Employee emp = new Employee(empno, name, dname, salary);
				empList.add(emp);
			}

		} catch (SQLException e) {
			System.out.println("While geeting employees :" + e);
		}
		return empList;
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
