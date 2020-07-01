package com.lwl.cj.day17;

import java.io.IOException;

class One  { }
class Two extends One{ }
class Three extends Two{ }

class E1 extends Exception{}
class E2 extends E1{}
class E3 extends E2{}


class C1{
	One m1(int a,int b) throws E2 {
		return new One();
	}
	
	int m2() {
		return 10;
	}
}

class C2 extends C1{
	@Override
	Three m1(int a,int b) {
		return new Three();
	}
	
}


class Person{
	String name;
	Person(String name){
		
	}
}

class Employee extends Person{
	public Employee() {
		super("name");
	}
}
public class InheritanceExample {

}
