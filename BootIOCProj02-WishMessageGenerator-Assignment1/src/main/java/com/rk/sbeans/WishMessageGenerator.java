package com.rk.sbeans;

import java.time.LocalTime;

import com.rk.BootIocProj02WishMessageGeneratorAssignment1Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{

	@Autowired
	private LocalTime currentTime;
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator: 0-param constructor");
	}
	
	public String showMessage(String user)
	{
		System.out.println("WishMessageGenerator.showMessage()");
		int hour= currentTime.getHour();
		if(hour < 12)
		{
			return "Good Morning "+user;
		}
		else if(hour < 16)
		{
			return "Good Afternoon "+user;
		}
		else if(hour < 20)
		{
			return "Good Evening "+user;
		}
		else
		{
			return "Good Night "+user;
		}
	}
}
