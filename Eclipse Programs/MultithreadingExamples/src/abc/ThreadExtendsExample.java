package abc;
class A extends Thread{
	@Override
	public void run() {
		Thread t  = Thread.currentThread();
			for(int i=0;i<=10;i++) {
				System.out.println(t+" "+i);
			}
	}
}
class B extends Thread{
	@Override
	public void run() {
		Thread t  = Thread.currentThread();
		for(int j=0;j<=10;j++) {
			System.out.println(t+" ="+j);
		}
	}
}
public class ThreadExtendsExample {
	public static void main(String[] args) {
	A obj1 = new A();		// obj1 is a thread class reference indirectly. 
	B obj2 = new B();		// obj1 is thread class reference indirectly. 
	
	obj1.start();				// Thread ready to run 
	obj2.start();				// Thead ready to run 
	obj1.setPriority(1);
	obj2.setPriority(10);
	System.out.println("in main "+obj1.currentThread());
	}

}
