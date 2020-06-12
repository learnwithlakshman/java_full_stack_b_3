package com.lwl.cj.day2;

import java.util.Scanner;

/*
 * Write a program to accept the following details of an employee: empno, name and monthly salary; calculate the yearly salary and display the result.
 */
public class EmployeeDetails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the empno:");
		int empno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		System.out.println("Enter the salary:");
		float salary = sc.nextFloat();
		
		float y_salary = salary * 12;
		
		System.out.println("Name : "+name+"\nEmpno: "+empno+"\nSalary: "+salary+"\nYearly Salary: "+y_salary);
		sc.close();
		
	}

}
