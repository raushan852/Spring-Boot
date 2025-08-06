package com.rk.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator 
{
	//HAS-A Properties
	private LocalTime time;
	private LocalDate date;
	
	//Simple properties
	private int age;
	private String email;
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator: 0-param constructor");
	}
	
	//Setter method for setter Injection
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Develop the b.method
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessage()");
		System.out.println("Date is: "+date+"....... Time is: "+time+"........ Age is: "+age+"...... Email is: "+email);
		//Get current hour of the day
		int hour= time.getHour();
		
		//Generate the wish message
		if(hour < 12)
		{
			return "Good Morning: "+user;			
		}
		else if(hour < 16)
		{
			return "Good Afternoon: "+user;			
		}
		else if(hour < 20)
		{
			return "Good Evening: "+user;
		}
		else
		{
			return "Good Night: "+user;			
		}
	}
}
