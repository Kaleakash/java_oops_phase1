package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str1 = new ArrayList<String>();
		str1.add("a1");
		str1.add("a2");
		str1.add("a3");
		str1.add("a4");
		str1.add("a10");
		str1.add("a20");
		str1.add("a30");
		System.out.println("Before Sort");
		for(Object s:str1) {
			System.out.print(s+" ");
		}
		Collections.sort(str1);			// sorting 
		System.out.println();
		System.out.println("After Sort");
		for(Object s:str1) {
			System.out.print(s+" ");
		}
	}

}
