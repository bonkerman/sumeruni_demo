package com.nortal.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DemoController {

	private static final String WELCOME_MESSAGE = "Welcome to Nortal!";
	private static final String NAMED_WELCOME_MESSAGE = "Welcome to Nortal, %s!";

	@GetMapping("/welcome")
	public String welcome(@RequestParam(required = false) final String name) {
		return name == null ? WELCOME_MESSAGE : String.format(NAMED_WELCOME_MESSAGE, name);
	}
}
