package com.lwl.cj.day3;

import java.util.Scanner;

public class StudentGradeCal {
	public static void main(String[] args) {
		//If average is < 35 -- “C”; >35 and <60 -- “B”; Otherwise -- “A” 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score :");
		int score = sc.nextInt();
		if(score < 35) {
			System.out.println("Grade : \"C\"");
		}else if(score >=35 && score <= 60) {
			System.out.println("Grade : \"B\"");
		}else {
			System.out.println("Grade : \"A\"");
		}
		sc.close();
	}
}
