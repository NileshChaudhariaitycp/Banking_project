package com.banking;

public abstract class Bank {

	private int AccId;
	private String name;
	private int balance;
	private int Duration;
	private int withdraw;
	private int Deposite;
	private int Amount;
	
	
	
	
	public Bank() {
		super();
	}




	public Bank(int accId, String name, int balance, int duration, int withdraw, int deposite, int amount) {
		super();
		AccId = accId;
		this.name = name;
		this.balance = balance;
		Duration = duration;
		this.withdraw = withdraw;
		Deposite = deposite;
		Amount = amount;
	}




	public int getAccId() {
		return AccId;
	}




	public void setAccId(int accId) {
		AccId = accId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getBalance() {
		return balance;
	}




	public void setBalance(int balance) {
		this.balance = balance;
	}




	public int getDuration() {
		return Duration;
	}




	public void setDuration(int duration) {
		Duration = duration;
	}




	public int getWithdraw() {
		return withdraw;
	}




	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}




	public int getDeposite() {
		return Deposite;
	}




	public void setDeposite(int deposite) {
		Deposite = deposite;
	}




	public int getAmount() {
		return Amount;
	}




	public void setAmount(int amount) {
		Amount = amount;
	}
	
	
	public abstract void Over_the_counter_activities();
	public abstract void Account_lifecycle();
	public abstract void Interest_Calculation();
	public abstract void End_of_day_report_for_daily_transaction();
	
	
}

