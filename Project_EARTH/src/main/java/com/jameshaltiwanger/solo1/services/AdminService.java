package com.jameshaltiwanger.solo1.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jameshaltiwanger.solo1.models.Admin;
import com.jameshaltiwanger.solo1.repositories.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository aRepo;
	
	public Admin registerAdmin(Admin admin) {
		String hashedPass = BCrypt.hashpw(admin.getPassword(), BCrypt.gensalt());
		admin.setPassword(hashedPass);
		return aRepo.save(admin);
	}
	
	public Admin findByName(String name) {
		return aRepo.findByName(name);
	}
	
	public Admin findAdminById(Long id) {
		Optional<Admin> a = aRepo.findById(id);
		if(a.isPresent()) {
			return a.get();
		} 
		else {
			return null;
		}
	}
	
	public boolean authenticateAdmin(String name, String password) {
		Admin admin = aRepo.findByName(name);
		if(admin == null) {
			return false;
		}
		else {
			if(BCrypt.checkpw(password, admin.getPassword())) {
				return true;
			} 
			else {
				return false;
			}
		}
	}
}
