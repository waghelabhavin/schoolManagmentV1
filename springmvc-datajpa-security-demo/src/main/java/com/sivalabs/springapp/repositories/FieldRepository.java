package com.sivalabs.springapp.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.sivalabs.springapp.entities.Field; 

public interface FieldRepository extends CrudRepository<Field, Serializable>{

}
