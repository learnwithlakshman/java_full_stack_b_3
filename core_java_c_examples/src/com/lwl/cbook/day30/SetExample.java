package com.lwl.cbook.day30;

import java.util.HashSet;
import java.util.Set;

class Person{
	
	String name;
	public Person(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class SetExample {
	public static void main(String[] args) {
		
		Person p1 = new Person("Krish");
		Person p2 = new Person("Manoj");
		Person p3 = new Person("Ramesh");
		Person p4 = new Person("Krish");
		Person p5 = new Person("Manoj");
		
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		System.out.println(set.size());
		
		
	}
}
