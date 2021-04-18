package xyz;
class A implements Runnable{
	@Override
	public void run() {
		Thread t  = Thread.currentThread();
			for(int i=0;i<=10;i++) {
				System.out.println(t+" "+i);
						try {
						t.sleep(1000);		// pause each iteration for 1 sec
						}catch(Exception e) {}
			}
	}
}
class B implements Runnable {
	@Override
	public void run() {
		Thread t  = Thread.currentThread();
			for(int i=0;i<=10;i++) {
				System.out.println(t+" "+i);
				try {
					Thread.sleep(500);		// pause each iteration for 1 sec
					}catch(Exception e) {}
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
		//System.out.println("1st Thread "+t1.isAlive());			//false 
		//System.out.println("2nd Thread "+t2.isAlive());			//false 
		t1.setName("1st Bike");
		t2.setName("2nd Bike");
		System.out.println("Game Start");
		
		t1.start();
		t2.start();
		
		//System.out.println("1st Thread "+t1.isAlive());			//true 
		//System.out.println("2nd Thread "+t2.isAlive());			//true 
		try {
		t1.join();				// thread 1 join with main thread 
		t2.join();				// thread 2 join with main thread 
		}catch(Exception e) {
			
		}
		System.out.println("Game end.......");
	}
}
