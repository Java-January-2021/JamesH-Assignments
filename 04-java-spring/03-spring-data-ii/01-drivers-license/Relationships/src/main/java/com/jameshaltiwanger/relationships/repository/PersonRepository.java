package com.jameshaltiwanger.relationships.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jameshaltiwanger.relationships.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();

	List<Person> findByLicenseIdIsNull();
}

