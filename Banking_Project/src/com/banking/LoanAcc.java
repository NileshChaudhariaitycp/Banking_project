package com.banking;

import java.util.Scanner;

public class LoanAcc extends Bank{

	private int loanAmount;
	final float Linterest = 0.12f;
	private int Repay;
	
	public LoanAcc()
	{
		
	}

	public LoanAcc(int accId, String name, int balance, int duration, int withdraw, int deposite, int amount, int loanAmount, int repay) {
		super(accId , name , balance , duration , withdraw , deposite , amount);
		this.loanAmount = loanAmount;
		Repay = repay;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getRepay() {
		return Repay;
	}

	public void setRepay(int repay) {
		Repay = repay;
	}

	public float getLinterest() {
		return Linterest;
	}
	
	@Override
	public void Over_the_counter_activities()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Account ID :");
		setAccId(sc.nextInt());
		System.out.println("Enter Customer Name       :");
		sc.nextLine();
		setName(sc.nextLine());
		System.out.println("Enter Customer Balance    :");
		setBalance(sc.nextInt());
		System.out.println("Enter Loan Amount    :");
		setLoanAmount(sc.nextInt());
		System.out.println("Enter Amount Which paid till date    :");
		setRepay(sc.nextInt());
		
		setBalance(getBalance()- getLoanAmount()- getRepay());
		setLoanAmount(getLoanAmount()-getRepay());
	}
	
	public void Account_lifecycle()
	{
		
	}
	
	
	
	public void Interest_Calculation()
	{
		
		
		System.out.println("Total Balance including Interest :"+getLoanAmount()*Linterest );
		
		
	}
	
	
	public void End_of_day_report_for_daily_transaction()
	{
		System.out.println("End of the day Report : ");
		System.out.println("Balance is : "+getBalance());
		System.out.println("Balance is : "+getLoanAmount());
	}
	
}

