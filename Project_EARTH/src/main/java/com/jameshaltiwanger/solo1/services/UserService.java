package com.jameshaltiwanger.solo1.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jameshaltiwanger.solo1.models.User;
import com.jameshaltiwanger.solo1.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository uRepo;
	
	public User registerUser(User user) {
		LocalDate newDate = LocalDate.now();
		user.setCreatedAt(newDate);
		return uRepo.save(user);
	}
	
	public List<User> getAllUsersReverse() {
		return uRepo.findAllByOrderByIdDesc();
	}
}
