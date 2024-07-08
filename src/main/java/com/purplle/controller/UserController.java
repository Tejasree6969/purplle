package com.purplle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purplle.dto.UserDto;
import com.purplle.service.UserService;


@RequestMapping("/api")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public UserDto getAllUsers() {

		UserDto userDto = userService.getAllUsers();
		return userDto;

	}

	@PutMapping("/user")
	public UserDto updateUser(UserDto userDto) {

		userDto = userService.updateUser(userDto);
		return userDto;

	}

}


