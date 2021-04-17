interface A {
	void dis();
}
class B {
	void dis() {
		System.out.println("B class method");
	}
}
class C extends B implements A{
	@Override
	public void dis() {
		super.dis();
		System.out.println("B class method - override");
	}
}
public class Demo {
	public static void main(String[] args) {
		C obj = new C();
		obj.dis();
	}

}
