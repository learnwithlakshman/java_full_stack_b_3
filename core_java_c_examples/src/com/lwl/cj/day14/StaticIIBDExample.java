package com.lwl.cj.day14;

class Employee {
	private int empno;
	private String ename;
	private double salary;
	public static String orgName="LWL";
	public static int count = 0;
	
	{
		System.out.println("IIB");
		count++;
	}
	static {
		System.out.println("Static Block");
	}
	public Employee() {
	}
	public Employee(int empno) {
	}
	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	public Employee(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
}

public class StaticIIBDExample {
	public static void main(String[] args) {
		System.out.println("Main Method");
		Employee emp1 = new Employee(1001, "Krish");
		Employee emp2 = emp1;
	}
}
