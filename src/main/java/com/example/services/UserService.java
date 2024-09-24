package com.example.services;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.module.User;
@Service


public class UserService {
	
	List<User> list=new  ArrayList<>();
	
	
	public UserService() {
		list.add(new User("abc","abc","abc"));
		list.add(new User("abcx","abcy","abcy"));
		
	}
	// get all users
	public List<User> getAllUsers(){
		return this.list;
		
	}
	
	//get single username;
	
	public User getUser(String username) {
		
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	public User addUser(User user)
	{
		this.list.add(user);
		return user;
	}

}
