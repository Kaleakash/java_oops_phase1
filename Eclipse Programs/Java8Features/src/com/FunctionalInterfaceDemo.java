package com;

@FunctionalInterface
interface Demo {
		void dis1();
		default void dis2() {}
		static void dis3() {}
		default void dis4() {}
		
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

	}

}
