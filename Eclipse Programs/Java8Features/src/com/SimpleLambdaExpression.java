package com;
interface A {
		void dis1();
		default void dis2() {}
}
class B implements A {
	public void dis1() {
		System.out.println(" B class provided the body for A interface method");
	}
}
public class SimpleLambdaExpression {
	public static void main(String[] args) {
		A obj1 = new B();
		obj1.dis1();
		A obj2 = new A(){
			public void dis1() {
				System.out.println("Anonymous class provided for A interface method");
			}
		};
		obj2.dis1();
		
		A obj3 =new A() {
			public void dis1() {
				System.out.println("Anonymous class provided for A interface method - different logic");
			}
		};
		obj3.dis1();
		
		System.out.println(obj2.getClass());
		
		A obj4 = ()->System.out.println("This is lambda expression");
		obj4.dis1();
		
	}

}
