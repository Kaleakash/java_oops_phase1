package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//HashSet<Double> lhs = new HashSet<>();
	LinkedHashSet<Double> lhs = new LinkedHashSet<>();
		lhs.add(50.45);
	lhs.add(10.20);
	lhs.add(30.0);
	lhs.add(40.45);
	lhs.add(102.10);
	System.out.println(lhs);
	}

}
