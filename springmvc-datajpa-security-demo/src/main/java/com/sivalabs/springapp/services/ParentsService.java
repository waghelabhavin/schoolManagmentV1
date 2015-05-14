/**
 * 
 */
package com.sivalabs.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;  
//import com.schoolManagment.springapp.dao.UserDao; 



import com.sivalabs.springapp.entities.Parents;
import com.sivalabs.springapp.entities.User;
import com.sivalabs.springapp.repositories.ParentsRepository;


/**
 * @author Siva
 *
 */
@Service
@Transactional
public class ParentsService 
{
	//private UserDao userDao;
	
	@Autowired
	private ParentsRepository parentRepository;
	
	/*
	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	*/
	public List<User> findAll() {
		//return userDao.findAll();
		return parentRepository.findAll();
	}

	public User create(Parents parent) {
		//return userDao.create(user);
		return parentRepository.save(parent);
	}

	public User findUserById(int id) {
		//return userDao.findUserById(id);
		return parentRepository.findOne((long) id);
	}

	public User login(String email, String password) {
		//return userDao.login(email,password);
		//return parentRepository.login(email,password);
		return parentRepository.findByEmailAndPassword(email,password);
	}

	public User update(Parents parent) {
		return parentRepository.save(parent);
	}

	public void deleteUser(int id) {
		parentRepository.delete((long) id);
	}

	public User findUserByEmail(String email) {
		return parentRepository.findUserByEmail(email);
	}
	
	
}

