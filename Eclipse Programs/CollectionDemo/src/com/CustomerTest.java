package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
	Customer c1 =new Customer(100, "Ajay", 24);
	System.out.println(c1);		// when we display reference in println internally call toString of 
										//object class. That return return className and code. 

	System.out.println(" id is "+c1.getCid());
	System.out.println("name is "+c1.getName());
	System.out.println("age is "+c1.getAge());
	System.out.println(c1);
	Customer c2 = new Customer(100, "Vijay", 32);
	Customer c3 = new Customer(100, "Lokesh", 34);
	List<Customer> listOfCustomer = new ArrayList<>();
	listOfCustomer.add(c1);
	listOfCustomer.add(c2);
	listOfCustomer.add(c3);
	
	System.out.println("Number of records are "+listOfCustomer.size());
	Iterator<Customer> ii = listOfCustomer.iterator();
	while(ii.hasNext()) {					// retrieve one object 
		Customer c = ii.next();			// assign the c and point to next object. 
		System.out.println(c);
	}
	}

}
