package com.banking;

import java.util.Scanner;

public class SalaryAcc extends Bank {

	private int NoOfTransactions;
	final float Sinterest = 0.06f;
	public SalaryAcc()
	{
		
	}
	public SalaryAcc(int accId, String name, int balance, int duration, int withdraw, int deposite, int amount , int noOfTransactions) {
		super(accId , name , balance , duration , withdraw , deposite , amount);
		NoOfTransactions = noOfTransactions;
	}
	public int getNoOfTransactions() {
		return NoOfTransactions;
	}
	public void setNoOfTransactions(int noOfTransactions) {
		NoOfTransactions = noOfTransactions;
	}
	public float getSinterest() {
		return Sinterest;
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
		
		System.out.println("Enter Choice : \n 1. Withdraw Money : \n 2.Deposite Money : \n 3.Display Balance : ");
		int choice  = sc.nextInt();
		
		
	switch(choice)
	{
	case 1 :
		System.out.println("Enter Amount to be withdraw :  ");
		setAmount(sc.nextInt());
		setBalance(getBalance()- getAmount());
		break;
	case 2 :
		System.out.println("Enter Amount to be Deposite :  ");
		setAmount(sc.nextInt());
		setBalance(getBalance() + getAmount());
	case 3 :
		System.out.println("Balance is       :  "+getBalance());
		System.out.println("Enter number of transactions : ");
		setNoOfTransactions(sc.nextInt());
		System.out.println("Enter the duration in month : ");
		setDuration(sc.nextInt());
		
		if(getNoOfTransactions()== 0 && getDuration() >= 2)
		{ 
			System.out.println("Your account is Blocked By the Bank :");
		}
		else 
		{
			System.out.println("Balance is : "+getBalance());
		}
		
	}
	
}
	
	@Override
	public void Account_lifecycle()
	{
		
	}
	
	@Override 
	public void Interest_Calculation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of years : ");
		setDuration(sc.nextInt());
		setBalance((int)(getBalance()+ (getDuration() * (getBalance() * Sinterest))));
		System.out.println("Total Balance including Interest :"+getBalance());
		
		
	}
	
	@Override
	public void End_of_day_report_for_daily_transaction()
	{
		System.out.println("Number of transaction is : "+NoOfTransactions);
		System.out.println("Balance is : "+getBalance());
	}
	
	
}
