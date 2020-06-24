package com.lwl.cj.day13;

public class Product {

	private int pid;
	private String pname;
	private double price;
	
	private static int newId = 1001;
	
	public static int count = 0;

	public Product(String pname, double price) {
	
		this.pid = newId++;
		this.pname = pname;
		this.price = price;
		count++;
	}

	public void showInfo() {
		System.out.println(formatData());
	}

	private String formatData() {
		return String.format("Pid %d%nPname %s%nPrice : %f", pid, pname, price);
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
