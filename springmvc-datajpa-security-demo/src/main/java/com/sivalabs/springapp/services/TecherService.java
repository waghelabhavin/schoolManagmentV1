/**
 * 
 */
package com.sivalabs.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 

import com.sivalabs.springapp.entities.Teacher;
import com.sivalabs.springapp.entities.User;
import com.sivalabs.springapp.repositories.TeacherRepository;


/**
 * @author Siva
 *
 */
@Service
@Transactional
public class TecherService 
{
	//private UserDao userDao;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	/*
	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	*/
	public List<User> findAll() {
		//return userDao.findAll();
		return teacherRepository.findAll();
	}

	public User create(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public User findUserById(int id) {
		//return userDao.findUserById(id);
		return teacherRepository.findOne((long) id);
	}

	public User login(String email, String password) {
		//return userDao.login(email,password);
		//return userRepository.login(email,password);
		return teacherRepository.findByEmailAndPassword(email,password);
	}

	public User update(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public void deleteUser(int id) {
		teacherRepository.delete((long) id);
	}

	public User findUserByEmail(String email) {
		return teacherRepository.findUserByEmail(email);
	}
	
	
}

