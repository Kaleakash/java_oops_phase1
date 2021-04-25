package com;

public class Customer {
private int cid;
private String name;
private float age;

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int cid, String name, float age) {
	super();
	this.cid = cid;
	this.name = name;
	this.age = age;
}


@Override
public String toString() {
	return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + "]";
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}

}
