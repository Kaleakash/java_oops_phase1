package com;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	Map<String, Integer> mm = new  HashMap<>();
	mm.put("Ravi",12000);
	mm.put("Ramesh", 14000);
	mm.put("Ajay",16000);
	System.out.println(mm);
	mm.put("Ajay", 18000);		// by default if same key present value replace by new value. 
	System.out.println(mm);
	mm.put("Balaji", 12000);
	System.out.println(mm);
		if(mm.containsKey("Ajay")) {
			
		}else {
			
		}
		mm.replace("Ravi", 22000);			// replace value using key 
		System.out.println(mm);
		System.out.println("Value "+mm.get("Ravi"));			// retrieve value using key 
		mm.remove("Ravi");													// remove record using key 
		//mm.replace("Ravi Kumar", 22000);
		System.out.println(mm);
		mm.put("Mahesh", 12000);
		System.out.println(mm);
		mm.put(null, null);
		System.out.println(mm);
	}

}
