package com.jameshaltiwanger.languages.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jameshaltiwanger.languages.models.Language;

public interface LanguagesRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
}
