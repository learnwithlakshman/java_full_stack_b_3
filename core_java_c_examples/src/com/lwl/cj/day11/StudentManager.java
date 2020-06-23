package com.lwl.cj.day11;

import java.util.Arrays;

public class StudentManager {
	public static void main(String[] args) {

		Student student = new Student();
		student.setValues();
		System.out.println(student.sid);
		System.out.println(student.name);
		System.out.println(Arrays.toString(student.marks));

		System.out.println(student.totalScore());
		System.out.println(student.getGrade());
	}
}
