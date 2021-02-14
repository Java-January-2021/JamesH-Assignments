package com.jameshaltiwanger.relationships.service;

import org.springframework.stereotype.Service;

import com.jameshaltiwanger.relationships.models.License;
import com.jameshaltiwanger.relationships.repository.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepo;
	public LicenseService(LicenseRepository repo) {
		this.licenseRepo = repo;
	}
	
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNmber());
		return licenseRepo.save(l);
	}
	
	public Integer generateLicenseNmber() {
		License num = licenseRepo.findTopByOrderByNumberDesc();
		if(num == null)
			return 1;
		Integer largestNumber = num.getNumber();
		largestNumber++;
		return (largestNumber);
	}
}
