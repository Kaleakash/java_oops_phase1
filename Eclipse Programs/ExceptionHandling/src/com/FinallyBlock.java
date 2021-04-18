package com;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int res =10/0;
			System.out.println("No Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Normal statement");
	}
}
