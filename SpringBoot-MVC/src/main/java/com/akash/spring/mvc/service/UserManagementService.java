package com.akash.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.spring.mvc.entity.User;
import com.akash.spring.mvc.repo.UserManagemnetRepository;

@Service
public class UserManagementService {
	
	@Autowired(required = true)
	UserManagemnetRepository userManagementRepository;
	
	public String createUser(String name, String email, String pass, long contact) {
		
		User details = new User();
		details.setEmail(email);
		details.setName(name);
		details.setPassword(pass);
		details.setContact(contact);
		
		if(userManagementRepository.findById(email).isPresent()) {
			return "Email Already existed. Try New One";
		}
		
		userManagementRepository.save(details);
		
		return "User created successfully...";
	}
	
	public User userLogin(String email, String password) {
		
		return userManagementRepository.findByEmailAndPassword(email, password);
	}
}
