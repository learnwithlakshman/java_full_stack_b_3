package com.lwl.cj.day12;

import java.time.LocalDate;

public class Employee {
	
	 int empno;
	 String ename;
	 LocalDate dob;
	 double salary;

	 public Employee(int empno,String ename) {
		 this(empno,ename,0);
	 }
	 
	 public Employee(int empno,String ename,double salary) {
		 this(empno,ename,null,salary);
	 }
	 
	 public Employee(int empno,String ename,LocalDate dob,double salary) {
		 this.empno = empno;
		 this.ename = ename;
		 this.dob = dob;
		 this.salary = salary;
	 }
	
	
	public void increment(double amount) {
		salary += amount;
	}
	public void showDetails() {
		System.out.println("Empno  :"+empno);
		System.out.println("Name   :"+ename);
		System.out.println("Dob    :"+dob);
		System.out.println("Salary :"+salary);
		
	}

	
}
