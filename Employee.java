package org.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Employee_Details")
public class Employee {
	@Id
	@Column(name = "Emp_Id")
	@GeneratedValue
	private int id;
	@Column(name = "Emp_Name", length = 150,nullable = false)
	private String name;
	@Column(name = "Email_Id")
	private String email;
	@Column(name = "Phone_No")
	private long phone;
	@Column(name = "Basic_Salary")
	private double basicSalary;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "PF")
	private float provident_fund;
	@Column(name = "TA")
	private float travelAllowance;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Transient
	private double netSalary;

	public Employee() {

	}

	public Employee(String name, String email, long phone) {
		super();
		//this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

};
