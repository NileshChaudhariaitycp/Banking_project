package com.banking;

public class BusinessLogic {

	public void banking(Bank b)
	{
		b.Over_the_counter_activities();
		b.Account_lifecycle();
		b.Interest_Calculation();
		b.End_of_day_report_for_daily_transaction();
	}
	
}
