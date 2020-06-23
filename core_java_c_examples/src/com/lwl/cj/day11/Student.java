package com.lwl.cj.day11;

public class Student {

	String sid;
	String name;
	int[] marks;

	public void setValues() {
		sid = "1001";
		name = "Krish";
		marks = new int[]{50,60,70};
	}
	public int totalScore() {
		int total = 0;
		for(int m:marks) {
			total += m;
		}
		return total;
	}

	public String getGrade() {
		int total = totalScore();
		float avg = total/marks.length;
		if(avg > 90) {
			return "A";
		}else if(avg > 60 && avg <=90) {
			return "B";
		}
		return "C";
	}

	public void showDetails() {
		System.out.println("Regno :" + sid);
		System.out.println("Name  :" + name);
		System.out.println("Total : " + totalScore());
		System.out.println("Grade : " + getGrade());

	}
}
