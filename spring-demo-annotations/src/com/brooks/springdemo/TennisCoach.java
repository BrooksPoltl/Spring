package com.brooks.springdemo;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "work on backhand volley";
	}
	
}
