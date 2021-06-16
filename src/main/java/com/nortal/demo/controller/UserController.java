package com.nortal.demo.controller;

import java.util.Collection;
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
import com.nortal.demo.users.User;

@RestController
@RequestMapping("/nortal/users")
@RequiredArgsConstructor
public class UserController {

	private final List<User> users;
	private final Repository repository;

	@GetMapping
	public Collection<String> getUsers() {
		return repository.getAll();
	}

	@GetMapping("/legacy")
	public Collection<User> getUsersLegacy() {
		return users;
	}

	@DeleteMapping("/{name}")
	public Collection<String> deleteUser(@PathVariable final String name) {
		repository.delete(name);
		return repository.getAll();
	}

	@PostMapping
	public Collection<String> saveUser(@RequestBody final String name) {
		repository.save(name);
		return repository.getAll();
	}

}
