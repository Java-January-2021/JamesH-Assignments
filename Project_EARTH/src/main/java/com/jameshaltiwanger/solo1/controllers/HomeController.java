package com.jameshaltiwanger.solo1.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jameshaltiwanger.solo1.models.Admin;
import com.jameshaltiwanger.solo1.models.ForestProgressPost;
import com.jameshaltiwanger.solo1.models.User;
import com.jameshaltiwanger.solo1.services.AdminService;
import com.jameshaltiwanger.solo1.services.ForestPPService;
import com.jameshaltiwanger.solo1.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private AdminService adminService;
	@Autowired
	private ForestPPService fppService;
	
	@RequestMapping("/")
	public String Home(HttpSession session, Model model) {
		if((Long) session.getAttribute("adminId") != null){
			Long aId = (Long) session.getAttribute("adminId");
	    	Admin a = adminService.findAdminById(aId);
	    	model.addAttribute("admin", a);
		}
		return "homePage.jsp";
	}
	
	@RequestMapping("/projects")
	public String Projects(HttpSession session, Model model) {
		if((Long) session.getAttribute("adminId") != null){
			Long aId = (Long) session.getAttribute("adminId");
	    	Admin a = adminService.findAdminById(aId);
	    	model.addAttribute("admin", a);
		}
		return "projectsPage.jsp";
	}
	
	@RequestMapping("/getinvolved")
	public String GetInvolved(@ModelAttribute("register") User user, HttpSession session, Model model) {
		if((Long) session.getAttribute("adminId") != null){
			Long aId = (Long) session.getAttribute("adminId");
	    	Admin a = adminService.findAdminById(aId);
	    	model.addAttribute("admin", a);
		}
		return "getInvolvedPage.jsp";
	}
	
	@PostMapping("/userregister")
	public String registerUser(@Valid @ModelAttribute("register") User user, BindingResult result) {
		if(result.hasErrors()) {
			return "getInvolvedPage.jsp";
		}
		userService.registerUser(user);
		return "thanksRegisterPage.jsp";
	}
	
	@RequestMapping("/adminhome")
    public String adminHome(HttpSession session, Model model) {
		if((Long) session.getAttribute("adminId") != null){
			Long aId = (Long) session.getAttribute("adminId");
	    	Admin a = adminService.findAdminById(aId);
	    	model.addAttribute("admin", a);
	    	return "adminHome.jsp";
		}
		else {
    		return "homePage.jsp";
    	}
    }
    
    @RequestMapping("/userlist")
    public String userList(HttpSession session, Model model) {
    	if((Long) session.getAttribute("adminId") != null){
			Long aId = (Long) session.getAttribute("adminId");
	    	Admin a = adminService.findAdminById(aId);
	    	model.addAttribute("admin", a);
	    	List<User> users = userService.getAllUsersReverse();
	    	model.addAttribute("users", users);
	    	return "userList.jsp";
		}
    	else {
    		return "homePage.jsp";
    	}
    }
    
    @RequestMapping("/forest")
	public String forestPage(HttpSession session, Model model) {
		if((Long) session.getAttribute("adminId") != null){
			Long aId = (Long) session.getAttribute("adminId");
	    	Admin a = adminService.findAdminById(aId);
	    	model.addAttribute("admin", a);
		}
		List<ForestProgressPost> fppList = fppService.getAllFPPsReverse();
		model.addAttribute("forestPP", fppList);
		return "forestProject.jsp";
	}
    
    @PostMapping("/forest")
	public String forestProgressPost(@RequestParam("text") String text) {
    	fppService.addPost(text);
		return "redirect:/forest";
	}
    
    @RequestMapping("/forest/{id}/edit")
    public String editFPP(@ModelAttribute("edit") ForestProgressPost edit, @PathVariable("id") Long id, HttpSession session, Model model) {
    	if((Long) session.getAttribute("adminId") != null){
			Long aId = (Long) session.getAttribute("adminId");
	    	Admin a = adminService.findAdminById(aId);
	    	model.addAttribute("admin", a);
	    	ForestProgressPost post = fppService.getPostById(id);
	    	model.addAttribute("post", post);
	    	edit = fppService.getPostById(id);
	    	return "editFPP.jsp";
		}
    	else {
    		return "homePage.jsp";
    	}
    }
    
    @PostMapping("/forest/{id}/edit")
    public String editFPPSubmit(@Valid @ModelAttribute("edit") ForestProgressPost post, BindingResult result,  @PathVariable("id") Long id, HttpSession session, Model model) {
    	if((Long) session.getAttribute("adminId") != null){
			Long aId = (Long) session.getAttribute("adminId");
	    	Admin a = adminService.findAdminById(aId);
	    	model.addAttribute("admin", a);
	    	if(result.hasErrors()) {
	    		ForestProgressPost postRetry = fppService.getPostById(id);
		    	model.addAttribute("post", postRetry);
	    		model.addAttribute("error", "Invalid entry. Please try again.");
	    		return "editFPP.jsp";
	    	}
	    	else {
	    		fppService.updatePost(post);
	    		return "redirect:/forest";
	    	}
    	}
    	else {
    		return "homePage.jsp";
    	}
    }
    
    @RequestMapping("/forest/{id}/delete")
    public String deleteCourse(@PathVariable("id") Long id) {
    	fppService.deletePost(id);
    	return "redirect:/forest";
    }
}
