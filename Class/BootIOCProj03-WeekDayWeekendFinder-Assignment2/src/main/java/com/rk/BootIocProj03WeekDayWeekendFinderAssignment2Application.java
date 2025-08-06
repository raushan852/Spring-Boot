package com.rk;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.rk.sbeans.WeekDay;

@SpringBootApplication
public class BootIocProj03WeekDayWeekendFinderAssignment2Application {

 @Bean("ld")
 public LocalDate ldate()
 {
	 return LocalDate.now();
 }
 
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx= SpringApplication.run(BootIocProj03WeekDayWeekendFinderAssignment2Application.class, args);) {
		WeekDay weekday = ctx.getBean("wd", WeekDay.class);
		System.out.println(weekday.showWeekDay());
//		String showMessage= weekday.showWeekDay();
//		System.out.println(showMessage);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
