package com.pia.workshop.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pia.workshop.dto.UserDto;
import com.pia.workshop.model.User;
import com.pia.workshop.service.UserService;

@RestController
@Validated
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/add-user")
	public User adduser(@Valid @RequestBody UserDto userDto) {
		return userService.addUser(userDto);
	}

	@GetMapping("/find-user/{name}")
	public List<User> findByName(@NotNull(message = "name field must be empty") @PathVariable("name") String name) {
		return userService.findByName(name);
	}
}
