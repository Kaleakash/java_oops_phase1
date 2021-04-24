package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
Employee emp1 = new Employee();
emp1.setId(100);
emp1.setName("Ravi");
emp1.setSalary(15000);

System.out.println("id is "+emp1.getId());
System.out.println("name is "+emp1.getName());
System.out.println("salary is "+emp1.getSalary());

FileOutputStream fos = new FileOutputStream("emp.txt");		//help to store in file 
ObjectOutputStream oos = new ObjectOutputStream(fos);		//	this class provide a method to store the object 
oos.writeObject(emp1);
System.out.println("object serialization done successfully..");
	/*	FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
				Object	obj = ois.readObject();
				Employee emp = (Employee)obj;			// type casting. down level type casting. .
				System.out.println("Id is "+emp.getId());
				System.out.println("Name is "+emp.getName());
				System.out.println("Salary is "+emp.getSalary());
				System.out.println("Object De-Serialization");
				*/
	}

}
