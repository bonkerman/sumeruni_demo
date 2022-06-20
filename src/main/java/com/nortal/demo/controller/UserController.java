package com.nortal.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import com.nortal.demo.repo.Repository;
import com.nortal.demo.users.BaseUser;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

	private final Repository repository;

	@GetMapping
	public List<BaseUser> getUsers() {
		return repository.getAll();
	}

	@DeleteMapping("/{name}")
	public List<BaseUser> deleteUser(@PathVariable final String name) {
		repository.delete(name);
		return repository.getAll();
	}

	@PostMapping
	public List<BaseUser> saveUser(@RequestBody final BaseUser user) {
		repository.save(user.getName());
		return repository.getAll();
	}

}
