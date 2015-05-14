package com.sivalabs.springapp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.servlet.ModelAndView;

import com.sivalabs.springapp.entities.DailyTask;
import com.sivalabs.springapp.form.validator.DailyTaskValidator;
import com.sivalabs.springapp.services.DailyTaskService;


@Controller
public class DailyTaskController {
	
	@Autowired
	DailyTaskValidator validator;
	
	@Autowired
	private DailyTaskService dailyTaskService;
	
	@RequestMapping(value="/create_daily_task_page", method=RequestMethod.GET)	
	public Model init(Model m) {;
		m.addAttribute("dailyTask", new DailyTask());
		return m;
	}
	
	@RequestMapping(value="/submitDailyTask", method=RequestMethod.POST)	
	public String submitDailyTask(@ModelAttribute("dailyTask") DailyTask dailyTask, BindingResult result, Model model) {
		validator.validate(dailyTask, result);
		if(result.hasErrors()) {
			model.addAttribute("result","failure");
			return "create_daily_task_page";
		}
		dailyTaskService.create(dailyTask);
		model.addAttribute("result", "success");
		return "create_daily_task_page";
	}
	
}
