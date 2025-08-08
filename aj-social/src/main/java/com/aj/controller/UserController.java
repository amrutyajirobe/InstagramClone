package com.aj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.models.User;

@RestController
public class UserController {

	@GetMapping ("/users")
	public List<User> getUsers () {
		List<User> users = new ArrayList<>();
		
		User user1  = new User("code", "aj", "codewithaj@gmail.com", "12345");
		User user2  = new User("ram", "arora", "ram@gmail.com", "12345");
		
		users.add(user1);	
		users.add(user2);


		return users;
	}
}
