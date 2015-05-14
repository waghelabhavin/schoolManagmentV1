package com.sivalabs.springapp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestingController {
	
 
	@RequestMapping(value="temp", method=RequestMethod.GET)	
	public String shopListPage(ModelAndView m) {
		m = new ModelAndView("temp"); 
		m.addObject("menu","MyTempMenu");
		
		return "temp";
	}
	
	@RequestMapping(value="schoolObject", method=RequestMethod.GET)	
	public String schoolManagmetRender(ModelAndView m) {
		m = new ModelAndView("temp"); 
		m.addObject("menu","MyTempMenu");
		
		return "schoolObject";
	}
}
