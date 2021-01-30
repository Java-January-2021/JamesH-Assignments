package com.jameshaltiwanger.routing.contoller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("") 
	public String dojo() {
		return "the dojo is awesome!";
	}
	
	@RequestMapping("/{location}")
	public String dojoLocation(@PathVariable("location") String locationName) {
		switch(locationName) {
		case "burbank":
			return "Burbank Dojo is located in Southern California";
		case "san-jose":
			return "SJ dojo is the headquarters";
		default:
			return String.format("%s is pretty sweet!", locationName);
		}
	}
}
