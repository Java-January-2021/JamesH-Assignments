package com.jameshaltiwanger.dojos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jameshaltiwanger.dojos.models.Dojo;
import com.jameshaltiwanger.dojos.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dRepo;
	public DojoService(DojoRepository repo) {
		this.dRepo = repo;
	}
	public List<Dojo> getAllDojos() {
		return dRepo.findAll();
	}
	public Dojo getDojo(Long id) {
		return dRepo.findById(id).orElse(null);
	}
	public Dojo createDojo(Dojo d) {
		return dRepo.save(d);
	}
}
