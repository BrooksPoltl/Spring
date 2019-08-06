package com.brooks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	
	@Override
	public String getDailyWorkout() {
		return "work on backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Autowired
	public void doCrazyStuff(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
}
