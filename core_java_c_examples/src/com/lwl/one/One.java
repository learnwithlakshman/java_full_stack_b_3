package com.lwl.one;

public class One {
	private int pri_a = 100;
	protected int pro_b = 200;
	int def_c = 300;
	public int pub_d = 400;
	
	public void show() {
		System.out.println("Private   :"+pri_a);
		System.out.println("Protected :"+pro_b);
		System.out.println("Default   :"+def_c);
		System.out.println("Public    :"+pub_d);
	}
}

