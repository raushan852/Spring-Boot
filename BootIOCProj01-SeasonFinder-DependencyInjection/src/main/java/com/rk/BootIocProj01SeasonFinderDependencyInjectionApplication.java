package com.rk;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.rk.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01SeasonFinderDependencyInjectionApplication {

	@Bean
	public LocalDate currentDate()
	{
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx= SpringApplication.run(BootIocProj01SeasonFinderDependencyInjectionApplication.class, args);)
		{
			SeasonFinder finder= ctx.getBean("sf", SeasonFinder.class);
			String season= finder.findSeason();
			System.out.println(season);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
