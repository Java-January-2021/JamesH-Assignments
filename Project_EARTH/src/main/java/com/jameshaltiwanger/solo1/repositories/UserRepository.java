package com.jameshaltiwanger.solo1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jameshaltiwanger.solo1.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findAll();
	List<User> findAllByOrderByIdDesc();
}
