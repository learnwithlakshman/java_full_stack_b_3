package com.lwl.cj.day24;

class OneException extends Exception {

}

class TwoException extends OneException {

}

class ThreeException extends TwoException {

}

class One {
	void m1() throws TwoException {
		// Logic
	}
}

class Two extends One {
	@Override
	void m1() {

	}
}

public class Manager {
	public static void main(String[] args) {
		
			try {
				
				int a = 10;
				int res = a / 0;
				
			}catch (Exception e) {
				
			}
			finally {
					System.out.println("Finally .....");
			}
			
			
			
			System.out.println("End of main");
	}
}
