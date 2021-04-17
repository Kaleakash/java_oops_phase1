package xyz;
//import abc.*;	// all classes belong to that package 
import abc.Employee;

public class Programmer extends Employee{
	public void disPrg() {
		System.out.println("a "+a);
		//System.out.println("b "+b);		// default within a same package 
		System.out.println("c "+c);
		//System.out.println("d "+d);		// private within a same class
	}
}
