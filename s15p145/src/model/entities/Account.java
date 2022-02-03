package model.entities;

import model.exceptions.AccountException;

public class Account {

	public int number;
	public String holder;
	public double balance;
	public double withdrawLimit;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Account() {}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) throws AccountException{
		if (amount>withdrawLimit)
			throw new AccountException("User atempted to withdraw an amount over the limit!");
		else if (amount>balance)
			throw new AccountException("Withdraw value exceeds account's balance!");
			
		balance-=amount;
	}
}
