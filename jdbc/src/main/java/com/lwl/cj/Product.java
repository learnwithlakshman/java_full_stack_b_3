package com.lwl.cj;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Product {
	
	private int pid;
	private String pname;
	private double price;
	
	
	
	public void display() {
		System.out.println("The Display Method");
	}

	public void show() {
		System.out.println("The Show Method");
	}

	private void print() {
		System.out.println("The Print Method");
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
}