package com.pia.workshop.model;

import java.util.UUID;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class User {

	private UUID id;
	private String name;
	private String surname;
	private String username;
}
