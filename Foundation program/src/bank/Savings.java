package com.bank;

public class Savings extends BankAccount {
	private static double maximumAmountToTransfer = 100000;
	private static int maximumNumberOfTransactions = 5;
	private double amountTransferred;
	private int noOfTransactions;

	public Savings() {
		super();
	}

	public Savings(long accountNumber, String accountHolder, String address, long phoneNo, String email,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNo, email, balance);
	}

	public static double getMaximumAmountToTransfer() {
		return maximumAmountToTransfer;
	}

	public static void setMaximumAmountToTransfer(double maximumAmountToTransfer) {
		Savings.maximumAmountToTransfer = maximumAmountToTransfer;
	}

	public static int getMaximumNumberOfTransactions() {
		return maximumNumberOfTransactions;
	}

	public static void setMaximumNumberOfTransactions(int maximumNumberOfTransactions) {
		Savings.maximumNumberOfTransactions = maximumNumberOfTransactions;
	}

	public double getAmountTransferred() {
		return amountTransferred;
	}

	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}

	public int getNoOfTransactions() {
		return noOfTransactions;
	}

	public void setNoOfTransactions(int noOfTransactions) {
		this.noOfTransactions = noOfTransactions;
	}

	@Override
	public boolean withdraw(double amount) {
		return super.withdraw(amount);
	}

	@Override
	public boolean deposit(double amount) {
		return super.deposit(amount);
	}

}
