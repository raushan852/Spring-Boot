package com.rk.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wd")
public class WeekDay 
{
	@Autowired
	private LocalDate ldate;
	
	public WeekDay()
	{
		System.out.println("WeekDay: 0-param constructor");
	}
	
	public String showWeekDay()
	{
		System.out.println("WeekDay.showWeekDay()");
		int value = ldate.getDayOfWeek().getValue();
		if(value == 6 || value == 7)
		{
			return "Enjoy your weekend";
		}
		else
		{
			return "Happy working hours";
		}
	}
}
