package com.lwl.cj;

import java.lang.reflect.Method;

class One {
	public One() {
		
	}
	public String fullName(String fname, String lname) {
		return fname.concat(" ").concat(lname);
	}
}

public class GetMethods {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.lwl.cj.One");
			Method method = c.getMethod("fullName", new Class[] { String.class, String.class });
			String fullName = (String) method.invoke(c.newInstance(), new Object[] { "JSL", "Java" });
			System.out.println("The full name is :" + fullName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}