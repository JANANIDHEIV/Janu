package com.bank;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name  = "BANK_DETAILS",discriminatorType = DiscriminatorType.STRING)
public class BankAccount {
	private long accountNumber;
	private String accountHolder;
	private String address;
	private long phoneNo;
	private String email;
	protected double balance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(long accountNumber, String accountHolder, String address, long phoneNo, String email,
			double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.balance = balance;
	}

	public BankAccount() {
		super();
	}

	public boolean withdraw(double amount) {
		if(amount >= this.balance){
			this.balance = this.balance -amount;
			return true;
		}
		return false;
	}

	public boolean deposit(double amount) {
		this.balance = this.balance+amount;
		return true;

	}

}
