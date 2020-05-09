package com.lwl.ems.domain;

public class Employee {

		private int empno;
		private String name;
		private String dname;
		private double salary;
		
		public Employee() {
		}
		
		public Employee(int empno, String name, String dname, double salary) {
			this.empno = empno;
			this.name = name;
			this.dname = dname;
			this.salary = salary;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", name=" + name + ", dname=" + dname + ", salary=" + salary + "]";
		}
			
}
