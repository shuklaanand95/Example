package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.module.User;
import com.example.services.UserService;

@RestController
//@RequestMapping("/users")

public class UserController {
	
	
	@Autowired
	private UserService userservice;
	private Object userService;
	
	
	
	// all users
	@GetMapping("/Alldata")
	public List<User> getAllUsers(){
		
		return ((UserService) this.userService).getAllUsers();
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username")String username) {
		return ((UserService) this.userService).getUser(username);
		
	}
	
  @PostMapping("/")
	public User add( @RequestBody User user) {
	  return ((UserService) this.userService).addUser(user);
  }
	
	
	
	
	
	
	
	
	
	
}
