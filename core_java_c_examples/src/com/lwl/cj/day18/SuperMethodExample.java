package com.lwl.cj.day18;


class C1{
	static {
		System.out.println("Static-C1");
	}
	C1(){
		super();
		System.out.println("C1");
	}
	{
		System.out.println("IIB-C1");
	}
	
	
}

class C2 extends C1{
	static {
		System.out.println("Static-C2");
	}
	C2(){
		super();
		System.out.println("C2");
	}
	{
		System.out.println("IIB-C2");
	}
  
}

public class SuperMethodExample {
	public static void main(String[] args) {
		C1 obj = new C2();
		
	}
}
