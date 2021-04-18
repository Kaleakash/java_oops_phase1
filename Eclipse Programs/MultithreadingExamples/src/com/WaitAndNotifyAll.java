package com;

import java.util.Iterator;
class Task implements Runnable{
	@Override
	public synchronized void run() {
			Thread t = Thread.currentThread();
			String name  = t.getName();
			for(int i=0;i<=10;i++) {
				try {
				Thread.sleep(1000);
				System.out.println(name +" "+i);
							if(i==5 && name.equals("Ajay")) {
								wait();			// wait(time); specific time pause. after that ready to run 
							}
							if(i==6 && name.equals("Mahesh")) {
								notify();
								wait();
							}
				}catch (Exception e) {}
			}
	}
}
public class WaitAndNotifyAll {
	public static void main(String[] args) {
	Task task = new Task();
	Thread t1  = new Thread(task);
	Thread t2  = new Thread(task);
	Thread t3  = new Thread(task);
	t1.setName("Ajay");     t2.setName("Vijay");	t3.setName("Mahesh");
	t1.start();			t2.start();				t3.start();
	}

}
