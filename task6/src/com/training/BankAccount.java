package com.training;

public abstract class BankAccount {
	private double depositAmount;
	private double withdrawAmount;
	private double minimumBalance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(double depositAmount, double withdrawAmount,double minimumBalance) {
		super();
		this.depositAmount = depositAmount;
		this.withdrawAmount = withdrawAmount;
		this.withdrawAmount = minimumBalance;
		}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
		}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public double getminimumBaance() {
		return getminimumBaance();
		}
	public void setminimumBalance(double minimumBalance) {
		this.setminimumBalance(minimumBalance);

	}
	public abstract double Deposit(double amount);
	public abstract double Withdraw(double amount);
	
}
