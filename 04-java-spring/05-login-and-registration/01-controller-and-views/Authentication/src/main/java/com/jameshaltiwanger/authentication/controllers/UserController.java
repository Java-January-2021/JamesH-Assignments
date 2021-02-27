package com.jameshaltiwanger.authentication.controllers;

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



import com.jameshaltiwanger.authentication.models.User;
import com.jameshaltiwanger.authentication.services.UserService;

@Controller
public class UserController { //most likely will have another controller for other things besides user registration, login, etc. Maybe?
	
	@Autowired
	private UserService userService;
    
    
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    
    @PostMapping("/registration")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	if(result.hasErrors()) {
    		return "registrationPage.jsp";
    	}
    	User u = userService.registerUser(user);
    	session.setAttribute("userId", u.getId()); //userId now has value of the new registered user's id! Session saves it until its "invalidated" which kind of means logged out, or turned off.  
    	return "redirect:/home";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session. and redirect them to /home route?
        // else, add error messages and return the login page
    	boolean isAuthenticated = userService.authenticateUser(email, password);
    	if(isAuthenticated) {
    		User u = userService.findByEmail(email);
    		session.setAttribute("userId", u.getId());
    		return "redirect:/home"; //I think redirecting keeps session info saved while going to another page. 
    	}
    	else {
    		model.addAttribute("error", "Invalid Credentials. Please try again.");
    		return "loginPage.jsp";
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
    	Long uId = (Long) session.getAttribute("userId");
    	User u = userService.findUserById(uId);
    	model.addAttribute("user", u);
    	return "homePage.jsp";
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
    	session.invalidate();
    	return "redirect:/login";
    }
}
