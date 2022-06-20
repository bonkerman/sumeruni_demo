package com.nortal.demo.users;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseUser {
	private String name;

	public BaseUser(final String name) {
		this.name = name;
	}
}
