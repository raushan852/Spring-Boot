package com.rk.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	
	@Autowired
	private LocalTime currentTime;
	
	public String showMessage()
	{
		int hour= currentTime.getHour();
		if(hour < 12)
		{
			return "Good Morning";
		}
		else if(hour < 16)
		{
			return "Good Afternoon";
		}
		else if(hour < 20)
		{
			return "Good Evening";
		}
		else
		{
			return "Good Night";
		}
	}
}
