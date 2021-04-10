class Car {
	int wheel;
	String color;
	float price;

	void start() {
		System.out.println("Car Started...");	
	}

	void appliedGear() {
		System.out.println("Applied Gear...");
	}
	void moving() {
		System.out.println("Car is moving...");
	}
	void stop() {
		System.out.println("Car Stop...");
	}
	
}
class App {
	public static void main(String args[]) {
	Car innova = new Car();	// memory created (heap memory)
	innova.start();
	innova.stop();
	}	
}



