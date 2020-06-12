package com.lwl.cj.day4;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
			
		if(num > 0) {
			if(num == 1)
				System.out.print("1 ");
			else {
				System.out.print("1 ");			
			for (int i = 2; i <= num/2 ; i++) {
				if (num % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.print(num);
			}
		}else {
			System.out.println("Invalid input, Please enter the +ve number");
		}
		sc.close();
	}}
