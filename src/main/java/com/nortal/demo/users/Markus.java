package com.nortal.demo.users;

import org.springframework.stereotype.Component;

@Component
public class Markus implements User {
	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}
}
