package com.jameshaltiwanger.relationships.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jameshaltiwanger.relationships.models.Person;
import com.jameshaltiwanger.relationships.repository.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepo;
	public PersonService(PersonRepository repo) {
		this.personRepo = repo;
	}

	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	public List<Person> getPeople() {
		return personRepo.findAll();
	}
	public List<Person> getUnlicensedPeople() {
		return personRepo.findByLicenseIdIsNull();
	}
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	
}
