package com;

interface Abc {
	default void dis1() {				// this method we can override in implementation class 
		System.out.println("This is default methods in interface  Java8");
	}
	static void dis2() {				// this method can't override 
		System.out.println("This is static method interface - Java8");
	}
	void dis3();
}
class Mno implements Abc {
	public void dis3() {
		System.out.println("provided body for dis3 methods");
	}
	@Override
	public void dis1() {
		System.out.println("overrided default method provided by interface");
	}
	
}
public class DefaultInterfaceMethod {
	public static void main(String[] args) {
		Mno obj = new Mno();
		obj.dis1();
		obj.dis3();
		Abc.dis2();
	}
}
