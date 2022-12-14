package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// expose "/" that return "Hello World"
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello world! Time on Server is" + LocalDateTime.now()
		;
	}
	
	//expose a new endpoint of daily workout
	@GetMapping("/workout")
	public String getDailyWorkout()
	{
		return "Run a Hard 5K!";		
	}

}
