interface Atm {
	public float withdrawamount(int pincode);
}

class Sbi implements Atm {
	public float withdrawamount(int pincode) {
		return 0;
	}
}
class Hdfc implements Atm {
	public float withdrawamount(int pincode) {
		return 0;
	}
}

public class AtmMachineDemo {
	public static void main(String[] args) {
	
	}
}
