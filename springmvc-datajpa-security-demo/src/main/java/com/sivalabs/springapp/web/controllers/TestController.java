package com.sivalabs.springapp.web.controllers;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sivalabs.springapp.services.MenuService;

@Controller
public class TestController {

	@Autowired 
	private MenuService menuService;
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)	
	public ModelAndView shopListPage(ModelAndView m) {
		m = new ModelAndView("welcome"); 
//		List<Menu> rootMenu = new ArrayList<Menu>();
//		Role role =  UserController.getCurrentUser().getRoles();
//		for(Menu menu :menuService.findMenu(role, null)) {
//			System.out.println("Bhavin Admin Menu: "+menu.getName());
//			rootMenu.add(menu);
//		}
//		m.addObject("menu",rootMenu);
		
		return m;
	} 
}













//if(!lMainMenu.contains(menu.getName())) {
//	System.out.println("BHAVIN ---> Menu "+menu.getName());
//	for(Menu subMenu: menu.getChildId()) {
//		System.out.println("BHAVIN ----> SubMenu "+subMenu.getName());
//	}
//}else{
//	lMainMenu.add(menu.getName());
//}