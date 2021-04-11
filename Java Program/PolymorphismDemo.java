interface A {
	void dis1();
}
class B implements A {
	public void dis1() {
		System.out.println("A class overrid method");
	}

}	

class PolymorphismDemo {
	public static void main(String args[]) {
	A obj1 = new B();	// sub class object and interface reference possible if class implementat that interface. 
	obj1.dis1();	
	}
}


