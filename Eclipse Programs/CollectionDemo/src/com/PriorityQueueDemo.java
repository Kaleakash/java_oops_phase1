package com;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
	/*PriorityQueue pq = new PriorityQueue<>();
	pq.add(4);
	pq.add(2);
	pq.add(6);
	pq.add(2);
	pq.add(1);
	System.out.println(pq);
	System.out.println(" poll "+pq.poll());			// delete the first elements depending upon the priority 
	System.out.println(pq);
	System.out.println(" poll "+pq.poll());
	System.out.println(pq);
	System.out.println(" poll "+pq.poll());
	System.out.println(pq);*/
		Deque d = new ArrayDeque();
		d.add(2);
		d.add(1);
		d.add(4);
		d.add(5);
		d.add(3);
		System.out.println(d);
		System.out.println(d.poll());
		System.out.println(d);
		System.out.println(d.poll());
	}

}
