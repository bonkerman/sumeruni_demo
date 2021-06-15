package com.nortal.demo.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class NameRepo implements Repository {

	private static List<String> names = new ArrayList<>();

	@Override
	public void save(final String name) {
		if (names.contains(name)) {
			return;
		}
		names.add(name);
		log.info("Name {} is saved", name);
	}

	@Override
	public void delete(final String name) {
		if (!names.contains(name)) {
			return;
		}
		names.remove(name);
		log.info("Name {} is deleted", name);
	}

	@Override
	public Collection<String> getAll() {
		log.info("All names are retrieved");
		return names;
	}
}
