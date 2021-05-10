package com.jameshaltiwanger.solo1.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jameshaltiwanger.solo1.models.Admin;

public interface AdminRepository extends CrudRepository<Admin,Long>{
	Admin findByName(String name);
	boolean existsByName(String name);
	Optional<Admin> findById(Long id);
}
