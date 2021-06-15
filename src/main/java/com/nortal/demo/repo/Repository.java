package com.nortal.demo.repo;

import java.util.Collection;

public interface Repository {
	void save(final String name);
	void delete(final String name);
	Collection<String> getAll();
}
