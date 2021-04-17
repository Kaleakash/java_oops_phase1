class Bike {
	void speed() {	
		System.out.println("60km/hr");
	}	
}
class Honda extends Bike {
	void color() {
		System.out.println("Black");
	}
}
class Pulsar extends Bike {
	@Override
	void speed() {	// method overriding super class method 
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Red");
	}
}

class Tvs extends Bike {
	@Override
	void speed() {	
		super.speed();			//merge both class code 	60km/hr calling super class method 
		System.out.println("20km/hr");
	}
	void color() {
		System.out.println("White");
	}
}
class PolymorphismDemo {
	public static void main(String args[]) {
	Honda hh = new Honda();		hh.color();	hh.speed();
	Pulsar pu = new Pulsar();		pu.color();	pu.speed();	
	Tvs t = new Tvs();			t.color();		t.speed();
	}
}
