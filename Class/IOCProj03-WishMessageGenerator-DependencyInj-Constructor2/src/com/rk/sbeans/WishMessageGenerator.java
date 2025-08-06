package com.rk.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator 
{
	//HAS-A properties
	private LocalTime time;
	private LocalDate date;
	
	//simple properties
	private int age;
	private String email;
	
	//Setter method for injection
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0-param constructor");
	}

	
	//Constructor for Injection
	public WishMessageGenerator(LocalTime time, int age) {
		super();
		System.out.println("WishMessageGenerator: 4-param constructor");
		this.time = time;
		this.age = age;
	}

	//Develop the b.method
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessage()");
		System.out.println("Date is: "+date+"....... Time is: "+time+"........ Age is: "+age+"...... Email is: "+email);
		int hour= time.getHour();
		if(hour < 12)
		{
			return "Good Morning: "+user;
		}
		else if(hour < 16)
		{
			return "Good Afternoon: +user";
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
