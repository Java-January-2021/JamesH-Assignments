package com.jameshaltiwanger.relationships.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jameshaltiwanger.relationships.models.License;
import com.jameshaltiwanger.relationships.models.Person;
import com.jameshaltiwanger.relationships.service.LicenseService;
import com.jameshaltiwanger.relationships.service.PersonService;

@Controller
public class HomeController {
	private final PersonService pService;
	private final LicenseService lService;
	public HomeController(PersonService pserv, LicenseService lserv) {
		this.pService = pserv;
		this.lService = lserv;
	}
	@RequestMapping("/")
	public String Index(Model model) {
		List<Person> people = pService.getPeople();
		model.addAttribute("people", people);
		return "index.jsp";
	}
	@PostMapping("/person")
	public String CreatePerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors() ) {
			return "newPerson.jsp";
		}
		pService.createPerson(person);
		return "redirect:/";
	}
	@PostMapping("/license")
	public String CreateLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors() ) {
			return "newLicense.jsp";
		}
		lService.createLicense(license);
		return "redirect:/";
	}
	@RequestMapping("/person/new")
	public String NewPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	@GetMapping("/license/new")
	public String NewLicense(@ModelAttribute("license") License license, Model model) { // Used in: <form:form action="/" method="POST" modelAttribute="license">
		model.addAttribute("people", this.pService.getUnlicensedPeople()); // Used in: <c:forEach items="${ people }" var="peeps">
		return "newLicense.jsp";
	}
	@RequestMapping("person/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", pService.getPerson(id));
		return "show.jsp";
	}
	
}
