package com.nortal.demo.controller;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
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

	@GetMapping("/spel")
	public Object spelCheck(@RequestParam final String spelExpression) {
		final ExpressionParser expressionParser = new SpelExpressionParser();
		final Expression expression = expressionParser.parseExpression(spelExpression);
		return expression.getValue();
	}
}
