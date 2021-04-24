package com;

import java.util.HashSet;

public class HashDemo {

	public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(100);
	hs.add(100.20);
	hs.add("Ravi");
	hs.add(200);
	hs.add(200);
	hs.add(12343524523532543l);
	System.out.println(hs);
	HashSet<Integer> hs1 = new HashSet<Integer>();
	hs1.add(100);
	hs1.add(200);
	hs1.add(300);
	hs1.add(400);
	hs1.add(400);
	System.out.println(hs1);
	}

}
