package com.brooks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return "this is random service";
	}

}
