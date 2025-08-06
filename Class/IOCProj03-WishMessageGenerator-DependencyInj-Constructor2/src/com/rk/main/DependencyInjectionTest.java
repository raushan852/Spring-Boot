package com.rk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rk.sbeans.WishMessageGenerator;

public class DependencyInjectionTest
{
	public static void main(String[] args)
	{
			FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/rk/cfgs/applicationContext.xml");
			
			WishMessageGenerator generator= (WishMessageGenerator) ctx.getBean("wmg");
			
			String result= generator.showWishMessage("Raushan");
			System.out.println(result);

	}

}
