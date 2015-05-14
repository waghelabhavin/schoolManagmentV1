/**
 * 
 */
package com.sivalabs.springapp.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;

import com.sivalabs.springapp.entities.Menu;
import com.sivalabs.springapp.entities.User;
import com.sivalabs.springapp.services.MenuService;
import com.sivalabs.springapp.services.UserService;
import com.sivalabs.springapp.web.config.SecurityUser;

/**
 * @author Siva
 *
 */
@Controller
public class UserController 
{
	private static UserService userService;
	private static MenuService menuService;
	
	@Autowired
	public void setUserService(UserService userService) {
		UserController.userService = userService;
	}
	
	@Autowired
	public void setMenuService(MenuService menuService) {
		UserController.menuService = menuService;
	}
	
	public static User getCurrentUser()
	{
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    if (principal instanceof UserDetails) 
	    {
	    	String email = ((UserDetails) principal).getUsername();
	    	User loginUser = userService.findUserByEmail(email);
	    	return new SecurityUser(loginUser);
	    }

	    return null;
	}
	
	public static List<Menu> getRootMenu() {
		List<Menu> rootMenu = new ArrayList<Menu>(); 
		for(Menu menu :menuService.findMenu(UserController.getCurrentUser().getRoles(), null)) {
			rootMenu.add(menu);
		}
		return rootMenu;
	}
}

