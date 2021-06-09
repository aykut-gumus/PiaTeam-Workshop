package com.pia.workshop.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pia.workshop.model.User;

public interface UserRepository extends MongoRepository<User, UUID> {
	static List<User> findByName(String name) {
		return null;
	}

	List<User> findByNameAndSurname(String name, String surname);

	User findByUsername(String username);
}
