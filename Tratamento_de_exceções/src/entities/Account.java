package entities;

import model.exception.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private double withDrawLimit;
	
	
	
	public Account(Integer number, String holder, Double balance, double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public double getWithDrawLimit() {
		return withDrawLimit;
	}
	public void setWithDrawLimit(double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void Deposit(Double balance) {
		this.balance += balance;
	}
	
	public void withdraw(Double balance) {
		if(balance > withDrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(balance > this.balance) {
			throw new DomainException("not enough balance");
		}
		this.balance -= balance;
	}
}
