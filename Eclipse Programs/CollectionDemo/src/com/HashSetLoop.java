package com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLoop {

	public static void main(String[] args) {
	HashSet<String> hs = new HashSet<>();
	hs.add("Ravi");	hs.add("Ramesh"); hs.add("Ajay"); hs.add("Vijay");
	System.out.println(hs);
	System.out.println("For each loop");
	for(String name: hs) {
		System.out.println(name);
	}
	System.out.println("Using iterator");
	// Iterator is a interface which help to retreive the element one by one
	Iterator<String> ii = hs.iterator();
	while(ii.hasNext())		// eleement present become true 
	{
		String name = ii.next();			// store the element and point to next element 
		System.out.println(name);
	}
	}

}
