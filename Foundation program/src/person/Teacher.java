package com.person;

public class Teacher extends Person {
	private double basicPay;
	private double houseRentAllowance;
	private double dearnessAllowance;
	private double providentFund;
	private double travelAllowance;
	private double netSalary;

	public Teacher(double basicPay, double houseRentAllowance, double dearnessAllowance, double providentFund,
			double travelAllowance) {
		super();
		this.basicPay = basicPay;
		this.houseRentAllowance = houseRentAllowance;
		this.dearnessAllowance = dearnessAllowance;
		this.providentFund = providentFund;
		this.travelAllowance = travelAllowance;
		//this.netSalary = netSalary;
	}

	public Teacher(String name, String address, String dept, double basicPay, double houseRentAllowance,
			double dearnessAllowance, double providentFund, double travelAllowance) {
		super(name, address, dept);
		this.basicPay = basicPay;
		this.houseRentAllowance = houseRentAllowance;
		this.dearnessAllowance = dearnessAllowance;
		this.providentFund = providentFund;
		this.travelAllowance = travelAllowance;
		//this.netSalary = netSalary;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String address, String dept) {
		super(name, address, dept);
		// TODO Auto-generated constructor stub
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(double houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public double getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(double dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public double getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(double providentFund) {
		this.providentFund = providentFund;
	}

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public double getNetSalary() {
		netSalary = this.basicPay
				+ ((this.houseRentAllowance + this.travelAllowance + this.dearnessAllowance - this.providentFund) / 100
						* this.basicPay);
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

}
