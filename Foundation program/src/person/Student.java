package com.person;

public class Student extends Person {
private int creditsEarned;
private char totalGrade;
public Student(int creditsEarned, char totalGrade) {
	super();
	this.creditsEarned = creditsEarned;
	this.totalGrade = totalGrade;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name, String address, String dept) {
	super(name, address, dept);
	// TODO Auto-generated constructor stub
}

public Student(String name, String address, String dept, int creditsEarned, char totalGrade) {
	super(name, address, dept);
	this.creditsEarned = creditsEarned;
	this.totalGrade = totalGrade;
}
public int getCreditsEarned() {
	return creditsEarned;
}
public void setCreditsEarned(int creditsEarned) {
	this.creditsEarned = creditsEarned;
}
public char getTotalGrade() {
	return totalGrade;
}
public void setTotalGrade(char totalGrade) {
	this.totalGrade = totalGrade;
}


}
