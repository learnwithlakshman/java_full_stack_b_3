package com.lwl.cj.day1;

public class HelloWorldWithArgs {
	
		public static void main(String[] args) {
			String name = "Kirsh";
			if(args.length != 0) {
				name = args[0];
			}
			System.out.println("Hello "+name + ", Welcome to Java World");
		}
		
		
}
