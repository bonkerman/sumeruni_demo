package com.nortal.demo.users;

public interface User {
	default String getName(){
		return this.getClass().getSimpleName();
	};
}
