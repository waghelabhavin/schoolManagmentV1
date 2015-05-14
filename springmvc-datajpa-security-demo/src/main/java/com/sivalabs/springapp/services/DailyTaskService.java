package com.sivalabs.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

import com.sivalabs.springapp.entities.DailyTask;
import com.sivalabs.springapp.repositories.DailyTaskRepository;

@Service
public class DailyTaskService {
	@Autowired
	private DailyTaskRepository dailyTaskRepo;
	
	public List<DailyTask> findAll() {
		//return userDao.findAll();
		return dailyTaskRepo.findAll();
	}

	public DailyTask create(DailyTask dailyTask) {
		//return userDao.create(user);
		return dailyTaskRepo.save(dailyTask);
	}
  
	public DailyTask update(DailyTask dailyTask) {
		return dailyTaskRepo.save(dailyTask);
	}

	public void deleteUser(int id) {
		dailyTaskRepo.delete(id);
	}
 
}
