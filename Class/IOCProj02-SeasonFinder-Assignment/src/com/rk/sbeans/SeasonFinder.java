package com.rk.sbeans;

import java.time.LocalDate;

public class SeasonFinder 
{
	//HAS-A properties
	private LocalDate date;
	
	//Setter injection
	public void setDate(LocalDate date)
	{
		this.date= date;
	}
	
	//Develop the b.method
	public String showSeason()
	{
		int month= date.getMonthValue();
		if(month > 10 || month < 2)
		{
			return "Winter Season";
		}
		else if(month <= 6)
		{
			return "Summer Season";
		}
		else if(month <= 10)
		{
			return "Rainy Season";
		}
		else
		{
			return "Invalid month";
		}
	}
	
}
