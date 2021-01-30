package com.jameshaltiwanger.HHuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HHController {

	@RequestMapping("/")
	public String index(@RequestParam(value="name",required=false, defaultValue="Human") String name) {
		return "Hello " + name;
	}
}
