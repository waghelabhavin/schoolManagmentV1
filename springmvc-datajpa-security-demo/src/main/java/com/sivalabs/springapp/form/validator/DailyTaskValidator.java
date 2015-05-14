package com.sivalabs.springapp.form.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sivalabs.springapp.entities.DailyTask;

@Component
public class DailyTaskValidator implements Validator{

	@Override
	public boolean supports(Class<?> dailyTask) {
		// TODO Auto-generated method stub
		return DailyTask.class.equals(dailyTask);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");		
	}

}
