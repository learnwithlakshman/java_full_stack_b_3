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
		int i =0;
		while(sc.hasNextLine()) {
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
		for(Employee emp:empArr) {
			emp.showDetails();
			System.out.println(".....................");
		}
		
		// Max,Min,Avg Salary
		
		// Display max paid employees
		
		// Display min paid employees
		
		// Display employee whose salary is more than avg salary		
		
		// Display employee whose name starts with letter 'M'
		
		
	}
}
