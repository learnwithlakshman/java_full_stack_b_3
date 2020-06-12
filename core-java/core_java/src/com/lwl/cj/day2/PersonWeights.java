package com.lwl.cj.day2;

import java.util.Scanner;

/*
 *  Write a program to accept the weight of 3 persons, calculate the total weight, determine the average weight and display these details.
 */
public class PersonWeights {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float p1_weight, p2_weight, p3_weight;
		
			
		System.out.println("Enter the person one weight:");
		p1_weight = sc.nextFloat();
		System.out.println("Enter the person two weight:");
		p2_weight = sc.nextFloat();
		System.out.println("Enter the person three weight:");
		p3_weight = sc.nextFloat();

		float sum_weight = p1_weight + p2_weight + p3_weight;
		float avg = sum_weight / 3;

		System.out.println("Sum of 3 persons weight is :" + sum_weight);
		System.out.println("Average weght of 3 persons is :" + avg);
		
		sc.close();

	}
}
