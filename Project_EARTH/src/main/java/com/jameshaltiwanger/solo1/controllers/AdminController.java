package com.jameshaltiwanger.solo1.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jameshaltiwanger.solo1.models.Admin;
import com.jameshaltiwanger.solo1.services.AdminService;
import com.jameshaltiwanger.solo1.validator.AdminValidator;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	@Autowired
	private AdminValidator adminValidator;

	@RequestMapping("/adminregister")
    public String adminRegisterForm(@ModelAttribute("admin") Admin admin) {
        return "adminRegisterForm.jsp";
    }
    
    @PostMapping("/adminregister")
    public String registerAdmin(@Valid @ModelAttribute("admin") Admin admin, BindingResult result) {
    	adminValidator.validate(admin, result);
    	if(result.hasErrors()) {
    		return "adminRegisterForm.jsp";
    	}
    	adminService.registerAdmin(admin); 
    	return "homePage.jsp";
    }
    
    @RequestMapping("/adminlogin")
    public String adminLoginForm() {
        return "adminLogin.jsp";
    }
    
    @PostMapping("/adminlogin")
    public String loginAdmin(@RequestParam("name") String name, @RequestParam("password") String password, Model model, HttpSession session) {
    	boolean isAuthenticated = adminService.authenticateAdmin(name, password);
    	if(isAuthenticated) {
    		Admin a = adminService.findByName(name);
    		session.setAttribute("adminId", a.getId());
    		return "redirect:/adminhome"; 
    	}
    	else {
    		model.addAttribute("error", "Invalid Credentials. Please try again.");
    		return "adminLogin.jsp";
    	}
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}
