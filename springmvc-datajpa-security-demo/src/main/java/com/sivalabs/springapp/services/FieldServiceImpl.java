package com.sivalabs.springapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.springapp.entities.Field;
import com.sivalabs.springapp.repositories.FieldRepository;

@Service
@Transactional
public class FieldServiceImpl implements FieldService{
	@Autowired
	private FieldRepository fieldRepo;
	
	public Field createField(Field field) {
		System.out.println("BHAVIN -----> field name "+field.getName());
		fieldRepo.save(field);
		return field;
	}
	
}
