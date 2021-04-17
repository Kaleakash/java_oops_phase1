package com;

public class DefaultThreadDetails {
	public static void main(String[] args) {
		Thread t = Thread. currentThread();
		System.out.println(t);
		t.setName("My Thread");
		t.setPriority(1);
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);		//10
		System.out.println(t);
	}
}
