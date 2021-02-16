package com.jameshaltiwanger.dojos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jameshaltiwanger.dojos.models.Ninja;
import com.jameshaltiwanger.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository nRepo;
	public NinjaService(NinjaRepository repo) {
		this.nRepo = repo;
	}
	public List<Ninja> getAllNinjas() {
		return nRepo.findAll();
	}
	public Ninja getNinja(Long id) {
		return nRepo.findById(id).orElse(null);
	}
	public Ninja createNinja(Ninja n) {
		return nRepo.save(n);
	}
}
