package com.nortal.demo.repo;

import java.util.List;
import com.nortal.demo.users.BaseUser;

public interface Repository {
	void save(final String name);
	void delete(final String name);
	List<BaseUser> getAll();
}
