package com.nortal.demo.repo;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import lombok.extern.log4j.Log4j2;
import com.nortal.demo.users.BaseUser;

@Service
@Log4j2
public class NameRepo implements Repository {

	private static final List<String> names = new ArrayList<>();

	@PostConstruct
	public void init() {
		log.info("NameRepo has started;");
	}

	@Override
	public void save(final String name) {
		if (names.contains(name)) {
			log.info("Name {} already exists", name);
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Name already exists");
		}
		names.add(name);
		log.info("Name {} is saved", name);
	}

	@Override
	public void delete(final String name) {
		if (!names.contains(name)) {
			log.info("There is no such name to delete");
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There is no such name to delete");
		}
		names.remove(name);
		log.info("Name {} is deleted", name);
	}

	@Override
	public List<BaseUser> getAll() {
		log.info("All names are retrieved");
		return names.stream().map(BaseUser::new).collect(Collectors.toList());
	}
}
