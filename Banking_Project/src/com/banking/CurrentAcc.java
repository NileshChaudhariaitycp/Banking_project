package com.banking;

import java.util.Scanner;

public class CurrentAcc extends Bank{
 
	 private int Overdraft;
 	 final float Cinterest = 0.06f;
 	 int Prev_trans;
 	 
 	 public CurrentAcc()
 	 {
 		 
 	 }

	public CurrentAcc(int accId, String name, int balance, int duration, int withdraw, int deposite, int amount, int overdraft) {
		super(accId , name , balance , duration , withdraw , deposite , amount );
		Overdraft = overdraft;
	}

	public int getOverdraft() {
		return Overdraft;
	}

	public void setOverdraft(int overdraft) {
		Overdraft = overdraft;
	}

	public float getCinterest() {
		return Cinterest;
	}
	
	public int getPrev_trans() {
		return Prev_trans;
	}
 	 
	public void setPrev_trans(int prev_trans) {
		Prev_trans = prev_trans;
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
		
		System.out.println("Enter Choice : \n 1. Withdraw Money : \n 2.Withdraw with Overdraft amount : \n 3.Deposite Money : ");
		int choice  = sc.nextInt();
		
		
	switch(choice)
	{
	case 1 :
		System.out.println("Enter Amount to be withdraw :  ");
		setAmount(sc.nextInt());
		if(getAmount() > 0) {
			
		setBalance(getBalance()- getWithdraw());
		Prev_trans = -getAmount();
		}
		else
		{
			System.out.println("You Have Entered Amount Is Unexpected :");
		}
		break;
	case 2 :
		System.out.println("Enter Amount to be Overdraft  :  ");
		setOverdraft(sc.nextInt());
		if(getOverdraft() > 15000)
		{
			System.out.println("Your Limit Exceeds");
		}
		else
		{
			 setBalance(getBalance()-getBalance()-getOverdraft());
			 Prev_trans = -getOverdraft();
		}
		 break;
	case 3 :
		System.out.println("Enter the Amount to be Deposite :");
	    setAmount(sc.nextInt());
	    setBalance(getBalance() + getAmount());
	    Prev_trans = getAmount();
		break;
		
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
		setBalance((int)(getBalance()+ (getDuration() * (getBalance() * Cinterest))));
		System.out.println("Total Balance including Interest :"+getBalance());
		
		
	}
	
	@Override
	public void End_of_day_report_for_daily_transaction()
	{
		System.out.println("End of day Reporting is : ");
		System.out.println("Previous Transaction is : "+Prev_trans);
		System.out.println("Balance is : "+getBalance());
		System.out.println("Overdraft  : "+getOverdraft());
	}
 	 
}
