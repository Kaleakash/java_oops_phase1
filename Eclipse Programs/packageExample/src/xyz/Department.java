package xyz;

import abc.Employee;

public class Department {
		Employee emp = new Employee();
		public void disEmpInfo() {
			System.out.println("a "+emp.a);	// public 
			//System.out.println("b "+emp.b);	// default 
		///	System.out.println("c "+emp.c);		//protected 
		//	System.out.println("d "+emp.d);	//private 
		}
}
