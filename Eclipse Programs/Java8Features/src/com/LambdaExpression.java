package com;

interface Add{
	int sum(int x, int y);
}
class Demo123 {
	static int sum(int x, int y) {
		return x+y;
	}
}
public class LambdaExpression {
	public static void main(String[] args) {
		Add obj1 = (x,y)->x+y;
		System.out.println(obj1.sum(10, 20));
		Add obj2 = (a,b)->a+b;
		System.out.println(obj2.sum(1, 2));
		Add obj3 = (int x, int y)->x+y;
		System.out.println(obj3.sum(100, 200));
		Add obj4 = (a,b)-> {
				int add = a+b;
				return add;
		};
		System.out.println(obj4.sum(1, 6));
		Add obj5  = Demo123::sum;
		System.out.println("Add using Method referece "+obj5.sum(100, 50));
	}
}
