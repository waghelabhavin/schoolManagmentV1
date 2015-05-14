package com.sivalabs.springapp.Util;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.Request;
import org.springframework.beans.factory.annotation.Autowired;

import com.sivalabs.springapp.services.MenuService;
import com.sivalabs.springapp.web.controllers.UserController;

public class TemplateGenerator implements ViewPreparer{
	@Autowired 
	private MenuService menuService;
	
	@Override
	public void execute(Request request, AttributeContext attContext) {
		ApplicationContext appContext = request.getApplicationContext();
		 
		appContext.getApplicationScope().put("menu",UserController.getRootMenu());
	}

}
