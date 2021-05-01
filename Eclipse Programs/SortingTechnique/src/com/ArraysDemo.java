package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		//int num[]= {5,3,2,7,8,1,6,9,10,20};
		String num[]= {"Ravi","Ajay","Ramesh","Vijay","Balaji"};
		System.out.println("Before Sort");
		for(String n:num) {
			System.out.print(n+" ");
		}
		Arrays.sort(num);
		System.out.println();
		System.out.println("After Sort");
		for(String n:num) {
			System.out.print(n+" ");
		}
	}
}
