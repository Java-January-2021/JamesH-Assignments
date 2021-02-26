package com.jameshaltiwanger.DojoOverflow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jameshaltiwanger.DojoOverflow.models.Tag;
import com.jameshaltiwanger.DojoOverflow.repositories.TagRepository;

@Service
public class TagService {
@Autowired
private TagRepository tRepo;

	public Tag createTag(Tag t) {
		return tRepo.save(t);
	}

	public boolean existsByT(String tag) {
		return tRepo.existsByTag(tag);
	}
	
	public Tag findByT(String tag) {
		return tRepo.findByTag(tag);
	}
}
