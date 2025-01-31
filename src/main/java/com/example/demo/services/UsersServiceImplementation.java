package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repository.UserRepository;


@Service
public class UsersServiceImplementation 
                            implements UsersService{
    @Autowired
	UserRepository repo;
	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "user added successfully";
	} 

}
