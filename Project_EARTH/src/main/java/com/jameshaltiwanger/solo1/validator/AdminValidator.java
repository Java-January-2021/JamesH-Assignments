package com.jameshaltiwanger.solo1.validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jameshaltiwanger.solo1.models.Admin;
import com.jameshaltiwanger.solo1.repositories.AdminRepository;

@Component
public class AdminValidator implements Validator {

	@Autowired
	private AdminRepository aRepo;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Admin.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		Admin admin = (Admin) target;
		if(!admin.getPasswordConfirmation().equals(admin.getPassword())) {
			errors.rejectValue("passwordConfirmation", "Match");
		}
		if(this.aRepo.existsByName(admin.getName())) {
			errors.rejectValue("name", "Unique", "That name has been taken. Please use unique name.");
		}
	}
}
