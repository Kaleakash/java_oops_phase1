package com;
//one client means 1 object. 
//100 client means 100 object 
class Booking implements Runnable{
	int avl=1;											
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name +"got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+"sorry no ticket");
		}
	}
}
public class MultipleThreadUsingOneClass {
	public static void main(String[] args) {
		Booking bb1 = new Booking();
		Thread t1 = new Thread(bb1);
		Thread t2 = new Thread(bb1);
		Thread t3 = new Thread(bb1);
		t1.setName("Ravi");
		t2.setName("Ramesh");
		t3.setName("Raju");
		t1.start();
		t2.start();
		t3.start();
	}
}
