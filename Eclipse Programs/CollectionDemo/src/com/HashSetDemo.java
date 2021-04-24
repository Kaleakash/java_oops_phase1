package com;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet<Integer> hs =  new HashSet<>();
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	hs.add(100);
	
	hs.add(200);
	hs.add(300);
	hs.add(600);
	System.out.println(hs);
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	System.out.println("Search "+hs.contains(100));
	System.out.println("Search "+hs.contains(1000));
		hs.remove(200);		// we can remove by value. 
	System.out.println(hs);
	hs.clear();  // remove all elements 
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	}

}
