class Employee {
	private int id;
	private String name;
	private float salary;
	public void setEmployee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void displayEmployee() {
		System.out.println("Id is "+this.id);
		System.out.println("Name is "+this.name);
		System.out.println("Salary is "+this.salary);
	}
}
class Manager extends Employee{
	private int numberOfEmp;
	public void setManager(int numberOfEmp) {
		this.numberOfEmp = numberOfEmp;
	}
	public void displayManager() {
		System.out.println("Number of Employee "+numberOfEmp);
	}
}
class Programmer {
	
}
class InheritanceDemo {
	public static void main(String args[]) {
	Employee emp1 = new Employee();
	emp1.setEmployee(100,"Ravi",12000);
	emp1.displayEmployee();		
	
	Manager mgr1 = new Manager();
	mgr1.setEmployee(101,"Ajay",45000);
	mgr1.setManager(12);
	mgr1.displayEmployee();
	mgr1.displayManager();
	}
}