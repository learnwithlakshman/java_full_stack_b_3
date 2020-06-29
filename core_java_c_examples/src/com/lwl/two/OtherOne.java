package com.lwl.two;

import com.lwl.one.One;

public class OtherOne {
	One obj = new One();
	public void show() {
		// System.out.println("Private   :"+obj.pri_a);
		// System.out.println("Protected :"+obj.pro_b);
		// System.out.println("Default   :"+obj.def_c);
		System.out.println("Public    :"+obj.pub_d);
	}
}
