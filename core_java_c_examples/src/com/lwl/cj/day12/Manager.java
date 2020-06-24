package com.lwl.cj.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class Manager {
	public static void main(String[] args) throws IOException {
		/*
		 * Employee emp1 = new
		 * Employee(1001,"Krish",LocalDate.now().minusYears(36),45000);
		 * emp1.showDetails();
		 * 
		 * Employee emp2 = new Employee(1002,"Mahesh",65000); emp2.showDetails();
		 * 
		 * Employee emp3 = new Employee(1003,"Charan"); emp3.showDetails();
		 */

		Scanner sc = new Scanner(Paths.get("resources/emp.txt"));
		int lineCount = Files.readAllLines(Paths.get("resources/emp.txt")).size();

		Employee[] empArr = new Employee[lineCount];
		int i = 0;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] arr = line.split(",");
			int empno = Integer.parseInt(arr[0]);
			String ename = arr[1];
			LocalDate dob = LocalDate.parse(arr[2]);
			double salary = Double.parseDouble(arr[3]);
			Employee emp = new Employee(empno, ename, dob, salary);
			empArr[i++] = emp;
		}
		// All employee
		for (Employee emp : empArr) {
			emp.showDetails();
			System.out.println(".....................");
		}

		// Max,Min,Avg Salary
		double maxSal, minSal, totalSal, avgSal;
		avgSal = totalSal = 0;
		maxSal = minSal = empArr[0].salary;
		for (Employee emp : empArr) {
			if (maxSal < emp.salary) {
				maxSal = emp.salary;
			}
			
			if(minSal > emp.salary) {
				minSal = emp.salary;
			}
			totalSal += emp.salary;
		}
		
		avgSal = totalSal / empArr.length;
		System.out.println("Min Salary :"+minSal);
		System.out.println("Max Salary :"+maxSal);
		System.out.println("Total Salary :"+totalSal);
		// Display max paid employees
		System.out.println("Max Salary paid Employee(s):");
		for(Employee emp:empArr) {
			if(emp.salary == maxSal) {
				emp.showDetails();
			}
		}
		
		// Display min paid employees
		System.out.println("Min Salary paid Employee(s):");
		for(Employee emp:empArr) {
			if(emp.salary == minSal) {
				emp.showDetails();
			}
		}
		// Display employee whose salary is more than avg salary
		System.out.println("Employee(s) Salary >= average salary:");
		for(Employee emp:empArr) {
			if(emp.salary >= avgSal) {
				emp.showDetails();
			}
		}
		// Display employee details, whose name starts with letter 'M'
		System.out.println("Employee(s) whose name starts with M");
		for(Employee emp:empArr) {
			if(emp.ename.startsWith("M")) {
				emp.showDetails();
			}
		}
	}
}
