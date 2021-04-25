package com;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1); ll1.add(2); ll1.add(3);
		
		// add(value), add(index,value);
		
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100);							// internally one node created... 
							ll.add(200);
		ll.add(300);						// break the link 
		ll.add(400);
		System.out.println(ll);
		ll.addFirst(10);					// al.add(0,10);
		ll.addLast(20);
		
		ll.addAll(ll1);			
		
		System.out.println(ll);
		System.out.println("using index position "+ll.get(1));
		System.out.println("retrieve first "+ll.getFirst());
		System.out.println("retireve last "+ll.getLast());
		ll.add(3, 1111);
		System.out.println(ll);
		ll.remove(1);				// using index position 
		ListIterator<Integer> ii = ll.listIterator();
		
		System.out.println("Element in forward direction");
		while(ii.hasNext()) {
			int n = ii.next();
			System.out.println(n);
		}
		System.out.println("Element in backward direction");
		while(ii.hasPrevious()) {
			int n = ii.previous();
			System.out.println(n);
		}
	}

}
