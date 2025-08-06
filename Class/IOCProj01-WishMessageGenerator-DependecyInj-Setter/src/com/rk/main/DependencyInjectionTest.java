package com.rk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rk.sbeans.WishMessageGenerator;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{
		//Create IOC container
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/rk/cfgs/applicationContext.xml");

		//Get target spring bean class obj ref
		Object obj = ctx.getBean("wmg");
		
		//Typecasting
		WishMessageGenerator generator= (WishMessageGenerator) obj;
		
		//Invoke the business method
		String result= generator.showWishMessage("Raushan");
		System.out.println(result);
		
		//Close the IOC container
		ctx.close();
		
	}

}
