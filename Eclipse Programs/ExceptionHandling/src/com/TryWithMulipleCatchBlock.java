package com;

public class TryWithMulipleCatchBlock {

	public static void main(String[] args) {
	System.out.println("Hi");
	int abc[]= {10,20,30,40};
	try {
		int res1 = 10/1;
		System.out.println("Result is "+res1);
		int res2 = 10/abc[1];
		System.out.println("Result is "+res2);
		System.out.println("No Exception ");
	}catch(ArithmeticException e) {
			System.out.println("divided by zero "+e.toString());
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Out of bond exception "+e.toString());
	}
	System.out.println("Finished...");
	}

}
