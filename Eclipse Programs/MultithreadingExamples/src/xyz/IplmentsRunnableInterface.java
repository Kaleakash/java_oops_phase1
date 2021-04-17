package xyz;
class A implements Runnable{
	@Override
	public void run() {
		Thread t  = Thread.currentThread();
			for(int i=0;i<=10;i++) {
				System.out.println(t+" "+i);
			}
	}
}
class B implements Runnable {
	@Override
	public void run() {
		Thread t  = Thread.currentThread();
			for(int i=0;i<=10;i++) {
				System.out.println(t+" "+i);
			}
	}
}
public class IplmentsRunnableInterface {
	public static void main(String[] args) {
		A obj1 = new A();		//obj1 is normal class object not a thread class object. 
		B obj2 = new B();
		Thread t1 = new Thread(obj1);		// We have create the object of thread class and pass the reference of that class which class 
																//implements runnable interfaces. 
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
