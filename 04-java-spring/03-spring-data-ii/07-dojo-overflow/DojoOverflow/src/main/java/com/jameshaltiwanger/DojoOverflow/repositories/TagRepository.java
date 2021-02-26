package com.jameshaltiwanger.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jameshaltiwanger.DojoOverflow.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Long>{
	
	boolean existsByTag(String tag);
	
	Tag findByTag(String tag);
}
