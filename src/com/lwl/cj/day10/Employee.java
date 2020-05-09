package com.lwl.cj.day10;

public class Employee {
	private int empno;
	private String ename;
	private String dname;
	private double salary;
	
	public Employee(int empno, String ename, String dname, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.dname = dname;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	 
}
