package com.rk;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.rk.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootIocProj02WishMessageGeneratorAssignment1Application {

	@Bean("lt")
	public LocalTime currentTime()
	{
		return LocalTime.now();
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx= SpringApplication.run(BootIocProj02WishMessageGeneratorAssignment1Application.class, args);)
		{
			WishMessageGenerator generator= ctx.getBean("wmg", WishMessageGenerator.class);
			String showMessage = generator.showMessage("Raushan");
			System.out.println(showMessage);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
