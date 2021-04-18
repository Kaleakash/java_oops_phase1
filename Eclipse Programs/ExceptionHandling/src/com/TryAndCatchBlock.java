package com;

public class TryAndCatchBlock {
	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=1;
	int abc[]= {100,200,300,400};
	try {
	int res = a/b;	// exception generate 	
	System.out.println("Result is "+res);		// this code doesn't exceute. 
	int res1 = 100/abc[5];
	System.out.println("Result is "+res1);
	System.out.println("No Exception");
	}catch(Exception e) {
		//System.out.println("I Take Care...");
		System.out.println(" Name of the exception "+e.toString());
	//	System.out.println( "Name of the exception "+e);
	}
	System.out.println("bye...");
	System.out.println("bye...");
	System.out.println("bye...");
	}
}
