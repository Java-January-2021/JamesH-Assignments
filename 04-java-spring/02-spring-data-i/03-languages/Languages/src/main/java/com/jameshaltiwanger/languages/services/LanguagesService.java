package com.jameshaltiwanger.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jameshaltiwanger.languages.models.Language;
import com.jameshaltiwanger.languages.repository.LanguagesRepository;

@Service
public class LanguagesService {
	
	//Dependency Injecting the CRUD methods from CrudRepository, extended by LanguagesRepository interface!
	//Looks like the whole point was to get .save(), .findAll(), .findById(), and .deleteById()!
	private final LanguagesRepository langRepo;
	
	public LanguagesService(LanguagesRepository repo) {
		langRepo = repo;
	}
	
	//Create
	public Language createLanguage(Language lang) {
		return langRepo.save(lang);
	}
		
	//Read
	public List<Language> allLanguages() {
		return langRepo.findAll();
	}
	
	//Read
	public Language findLanguage(Long id) {
		return langRepo.findById(id).orElse(null);
	}
	
	//Update
	public Language updateLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	//Delete
	public void deleteLanguage(Long id) {
		langRepo.deleteById(id);
	}
}
