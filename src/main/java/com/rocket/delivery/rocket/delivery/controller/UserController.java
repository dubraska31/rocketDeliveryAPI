package com.rocket.delivery.rocket.delivery.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {

	@GetMapping
	public ResponseEntity<Object> getAllUsers() {
		ArrayList<String> users = new ArrayList<>();
		users.add("du");
		users.add("naza");
		users.add("nico");

		return new ResponseEntity<>(users, HttpStatus.OK);
	}

}
