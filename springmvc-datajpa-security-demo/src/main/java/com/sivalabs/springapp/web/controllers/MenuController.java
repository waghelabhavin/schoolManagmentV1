package com.sivalabs.springapp.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sivalabs.springapp.entities.Menu;
import com.sivalabs.springapp.entities.Role;
import com.sivalabs.springapp.services.MenuService;

@Controller
public class MenuController {
	
	@Autowired 
	private MenuService menuService;
	
	@RequestMapping(value="/menu", method=RequestMethod.GET)	
	public String loadMenu(ModelAndView m) {
		m = new ModelAndView("base"); 
		List<Menu> rootMenu = new ArrayList<Menu>();
		Role role =  UserController.getCurrentUser().getRoles();
		for(Menu menu :menuService.findMenu(role, null)) {
			rootMenu.add(menu);
		}
		m.addObject("menu",rootMenu);
		return "menu";
	} 
}
