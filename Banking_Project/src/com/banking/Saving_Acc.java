package com.banking;
import java.util.*;
public class Saving_Acc extends Bank {
                
	final private float interest = 0.07f;
	
	
	public Saving_Acc()
	{
		super();
	}
	
	public Saving_Acc(int accId, String name, int balance, int duration, int withdraw, int deposite, int amount)
	{
		super(accId, name , balance , duration , withdraw , deposite ,amount);
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
		if(getBalance() >= 10000)
		{
			System.out.println("Customer balance is : "+getBalance());
		}
		else
		{
			System.out.println("Maintain the balance :");
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
		setBalance((int)(getBalance()+ (getDuration() * (getBalance() * interest))));
		System.out.println("Total Balance including Interest :"+getBalance());
		
		
	}
	
	public void End_of_day_report_for_daily_transaction()
	{
		System.out.println("Balance is : "+getBalance());
	}
}


