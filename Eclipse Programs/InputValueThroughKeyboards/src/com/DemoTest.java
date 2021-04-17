package com;

import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = obj.nextInt();		// This method to scan int value 
		obj.nextLine();			// to hold enter key
		System.out.println("Enter the name");
		String name = obj.nextLine();		// This method to scan string value 
		System.out.println("Enter the salary");
		float salary = obj.nextFloat();		//this method to scan float value;
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}

}
