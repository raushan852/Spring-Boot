package com.rk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rk.sbeans.SeasonFinder;

public class DependecyInjectionTest 
{
	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/rk/cfgs/applicationContext.xml");
		
		SeasonFinder finder = (SeasonFinder) ctx.getBean("sf");
		
		String result= finder.showSeason();
		System.out.println(result);
		
	}

}
