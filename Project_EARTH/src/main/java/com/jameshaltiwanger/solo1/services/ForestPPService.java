package com.jameshaltiwanger.solo1.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jameshaltiwanger.solo1.models.ForestProgressPost;
import com.jameshaltiwanger.solo1.repositories.ForestPPRepository;

@Service
public class ForestPPService {

	@Autowired
	private ForestPPRepository fppRepo;
	
	public List<ForestProgressPost> getAllFPPs() {
		return fppRepo.findAll();
	}
	
	public List<ForestProgressPost> getAllFPPsReverse() {
		return fppRepo.findAllByOrderByIdDesc();
	}
	
	public ForestProgressPost addPost(String text) {
		ForestProgressPost newFPP = new ForestProgressPost();
		LocalDate date = LocalDate.now();
		newFPP.setCreatedAt(date);
		newFPP.setText(text);
		return fppRepo.save(newFPP);
	}
	
	public ForestProgressPost getPostById(Long id) {
		return fppRepo.findById(id).orElse(null);
	}
	
	public ForestProgressPost updatePost(ForestProgressPost post) {
		return fppRepo.save(post);
	}
	
	public void deletePost(Long id) {
		fppRepo.deleteById(id);
	}
}
