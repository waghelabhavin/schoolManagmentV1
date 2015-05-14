package com.sivalabs.springapp.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.sivalabs.springapp.entities.DailyTask;

public interface DailyTaskRepository extends JpaRepository<DailyTask, Serializable> {
	
}
