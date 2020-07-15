package com.lwl.cbook.day29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.*;

public class Example1 {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// Before Java 8
		empList.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				int res = o1.getDesignation().compareTo(o2.getDesignation());
				if (res == 0) {
					return (o1.getSalary() > o2.getSalary() ? 1 : (o1.getSalary() < o2.getSalary() ? -1 : 0));
				}
				return res;

			}
		});
		for (Employee emp : empList) {
			System.out.println(emp);
		}
		System.out.println("---------------------------------------------------------------------------");

		// In Java 8

		empList.sort(comparing(Employee::getDesignation).thenComparing(comparing(Employee::getSalary).reversed()));
		empList.stream().forEach(System.out::println);

	}

	private static List<Employee> getEmpList() {
		return Arrays.asList(new Employee("Lakshman A", "Consultent", 450000),
				new Employee("Chaitra S", "Developer", 250000), new Employee("Manoj PVN", "Developer", 250000),
				new Employee("Ramesh R", "Developer", 280000), new Employee("Suresh S", "Developer", 270000),
				new Employee("Jaishree", "Opearations HR", 350000));
	}
}

class Employee {
	private String fullName;
	private String designation;
	private double salary;

	public Employee(String fullName, String designation, double salary) {
		super();
		this.fullName = fullName;
		this.designation = designation;
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", designation=" + designation + ", salary=" + salary + "]";
	}

}