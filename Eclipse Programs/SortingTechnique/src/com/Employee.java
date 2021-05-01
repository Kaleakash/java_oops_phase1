package com;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;
	@Override
	public int compareTo(Employee o) {
		/*if(this.id>o.id) {						+ve first object value > second object value 
			return -1;									-ve first object value < second object value 
		}else if(this.id<o.id) {					zero both object values are equal. 
			return 1;
		}else {
			return 0;
		}*/
		//return this.id-o.id;			//Asc id
		//return o.id-this.id;			//desc Id
			return (int)(this.salary-o.salary);			//Asc salary
			//return (int)(o.salary-this.salary);			//Desc salary
			//return this.name.compareTo(o.name);	//Asc name
			//return o.name.compareTo(this.name);		//Desc name
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
