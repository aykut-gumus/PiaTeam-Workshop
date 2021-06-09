package com.pia.workshop.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserDto {

	@NotNull(message = "name field cannot be empty")
	private String name;

	@NotNull(message = "user field cannot be empty")
	private String surname;

	@NotNull(message = "user field cannot be empty")
	private String username;
}
