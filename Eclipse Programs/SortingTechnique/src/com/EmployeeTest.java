package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
	List<Employee> listOfEmp = new ArrayList<>();
	listOfEmp.add(new Employee(2, "Ravi", 12000));
	listOfEmp.add(new Employee(1, "Ajay", 12000));
	listOfEmp.add(new Employee(3, "Vijay", 18000));
	System.out.println("Before sort");
	for(Employee emp:listOfEmp) {
		System.out.println(emp);
	}
	Collections.sort(listOfEmp);
	System.out.println("After sort");
	for(Employee emp:listOfEmp) {
		System.out.println(emp);
	}
	}

}
