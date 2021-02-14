package com.jameshaltiwanger.relationships.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jameshaltiwanger.relationships.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	List<License> findAll();
	License findTopByOrderByNumberDesc();
}

