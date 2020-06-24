package com.lwl.cj.day13;

public class Manager {
	

	public static void main(String[] args) {
		
		System.out.println("Total Products:" + Product.count);
		
		Product p1 = new Product("Dell Studio 15", 68000);
		Product p2 = new Product("Dell Studio 16", 78000);
		Product p3 = new Product("Dell Studio 18", 88000);
		Product p4 = new Product("Dell Studio 20", 98000);
		Product p5 = new Product("Dell Studio 19", 88000);
		Product p6 = new Product("Dell Studio 22", 98000);

		Product[] arr = { p1, p2, p3, p4,p5,p6 };

		double givenPrice = 85000;

		for (int i = 0; i < arr.length; i++) {
			Product p = arr[i];
			if (p.getPrice() <= givenPrice) {
				p.showInfo();
				System.out.println("---------------------");
			}
		}

		double price = 75000;// 10 %
		for (int i = 0; i < arr.length; i++) {
			Product p = arr[i];
			if (p.getPrice() >= price) {
				double discount = p.getPrice() * 0.1;
				double afterDiscount = p.getPrice() - discount;
				p.setPrice(afterDiscount);
			}
		}
		System.out.println("After discount product price details");
		for (Product p : arr) {
			p.showInfo();
			System.out.println("----------------");
		}
		
		System.out.println("Total Products:"+Product.count);

	}
}
