package com.example.demo.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Users;

import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class UsersController {
	@postMapping("/register")
	public String addUsers(@ModelAttribute Users user)
	{
		System.out.println(user.getUsername()+""
				+user.getEmail()+" "+user.getPassword()+" "+user.getGender()+" "+user.getRole()+" "+user.getAddress());
		
		
		return "home";
		
	}
}
