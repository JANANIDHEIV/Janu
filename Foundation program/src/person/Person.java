package com.person;

public class Person {
private int id;
private String name;
private String address;
private String dept;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, String address, String dept) {
	super();
	this.name = name;
	this.address = address;
	this.dept = dept;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

}
