package com.lwl.cj.day11;

public class Circle {

	private double radius;

	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
