package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack<Integer> ss = new Stack<>();
	ss.push(100);				// push use to add the element in stack 
	ss.push(200);
	ss.push(300);
	ss.push(400);
	System.out.println(ss);
	System.out.println("Top element remove "+ss.pop());// remove top most elements from stack 
	System.out.println(ss);
	System.out.println("Top element to check "+ss.peek());  // display top element display
	System.out.println(ss);
	System.out.println("Search "+ss.search(100));
	System.out.println("Search "+ss.search(1000));
	System.out.println("size "+ss.size());
	}

}
