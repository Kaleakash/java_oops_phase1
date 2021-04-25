package com;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(100);
		al.add("Ravi");			//1 position 
		al.add("Ravi");
		al.add("Ravi");
		al.add("Ravi");
		al.add(10.10);
		al.add(200);				// add at the last. 
		System.out.println(al);
		System.out.println("0 index position value "+al.get(0));
		System.out.println("1 index position value "+al.get(1));
		al.add(1, "Ajay");			// added Ajay in 1 position. 
		System.out.println("1 index position value "+al.get(1));
		System.out.println("2 index position value "+al.get(2));
		al.remove(1);				// using index position Ajay removed 
		al.remove("Ravi");		// using value 
		System.out.println(al);
		al.add(1,23);			// 1st position value move to next 
		System.out.println(al);
		al.set(1, 32);			// replace the element 	
		System.out.println(al);
		Integer a = 200;
		al.remove(a);				
		System.out.println(al);
		System.out.println("Using for loop");
		
		for(Object obj: al) {
			System.out.println(obj);
		}
	}

}
