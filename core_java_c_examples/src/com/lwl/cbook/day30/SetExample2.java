package com.lwl.cbook.day30;

class Employee{
	int empno;
	String name;
	public Employee(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	
}

public class SetExample2 {

		public static void main(String[] args) {
			Employee emp1 = new Employee(1001, "Krish");
		}
}
