package com.jameshaltiwanger.solo1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jameshaltiwanger.solo1.models.ForestProgressPost;

@Repository
public interface ForestPPRepository extends CrudRepository<ForestProgressPost, Long>{

	List<ForestProgressPost> findAll();
	List<ForestProgressPost> findAllByOrderByIdDesc();
}
