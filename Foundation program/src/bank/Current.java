package com.bank;

public class Current extends BankAccount {
	private static double minimumAmountToTransfer = 500000;
	private static int minimumNumberOfTransactions = 7;
	private double amountTransferred;
	private int noOfTransactions;

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(long accountNumber, String accountHolder, String address, long phoneNo, String email,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNo, email, balance);
		// TODO Auto-generated constructor stub
	}

	public static double getMinimumAmountToTransfer() {
		return minimumAmountToTransfer;
	}

	public static void setMinimumAmountToTransfer(double minimumAmountToTransfer) {
		Current.minimumAmountToTransfer = minimumAmountToTransfer;
	}

	public static int getMinimumNumberOfTransactions() {
		return minimumNumberOfTransactions;
	}

	public static void setMinimumNumberOfTransactions(int minimumNumberOfTransactions) {
		Current.minimumNumberOfTransactions = minimumNumberOfTransactions;
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
