package com.banking;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Bank b = null;
		boolean flag = false;
		BusinessLogic bl = new BusinessLogic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice : \n 1.Saving Account \n 2. Salary Account \n 3.Current Account \n 4.Loan Account ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 :
			/*
			b = new Saving_Acc();
			break;
			*/
		case 2 :
			b = new SalaryAcc();
			break;
		case 3 :
			b  = new CurrentAcc();
			break;
		case 4 :
			b = new LoanAcc();
			break;
			default :
			  flag = true;
			
			
		}
		if(flag == false)
		{
			bl.banking(b);
		}
		else
		{
			System.out.println("user wrong choice ");
		}
	}
}
