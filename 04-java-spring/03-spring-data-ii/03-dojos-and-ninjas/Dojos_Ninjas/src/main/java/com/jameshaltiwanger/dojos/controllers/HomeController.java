package com.jameshaltiwanger.dojos.controllers;

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

import com.jameshaltiwanger.dojos.models.Dojo;
import com.jameshaltiwanger.dojos.models.Ninja;
import com.jameshaltiwanger.dojos.services.DojoService;
import com.jameshaltiwanger.dojos.services.NinjaService;

@Controller
public class HomeController {
	private final DojoService dService;
	private final NinjaService nService;
	public HomeController(DojoService dserv, NinjaService nserv) {
		this.dService = dserv;
		this.nService = nserv;
	}
	
	@RequestMapping("/")
	public String Index(Model model) {
		List<Dojo> dojos = dService.getAllDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	@RequestMapping("/dojo/new")
	public String NewDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	@PostMapping("/dojo")
	public String CreateDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		dService.createDojo(dojo);
		return "redirect:/";
	}
	@RequestMapping("/ninja/new")
	public String NewNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojo", dService.getAllDojos());
		return "newNinja.jsp";
	}
	@PostMapping("/ninja")
	public String CreateNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newNinja.jsp";
		}
		nService.createNinja(ninja);
		return "redirect:/";
	}
	@GetMapping("/show/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		Dojo thisDojo = dService.getDojo(id);
		List<Ninja> ninjas = thisDojo.getNinjas();
		model.addAttribute("dojo", thisDojo);
		model.addAttribute("ninjas", ninjas);
		return "showDojo.jsp";
	}
}
