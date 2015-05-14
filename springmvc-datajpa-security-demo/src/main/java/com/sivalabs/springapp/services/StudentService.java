/**
 * 
 */
package com.sivalabs.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.springapp.entities.Student;
import com.sivalabs.springapp.entities.User;
import com.sivalabs.springapp.repositories.StudentRepository;
 


/**
 * @author Siva
 *
 */
@Service
@Transactional
public class StudentService 
{
	//private UserDao userDao;
	
	@Autowired
	private StudentRepository studentRepository;
	
	/*
	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	*/
	public List<User> findAll() {
		//return userDao.findAll();
		return studentRepository.findAll();
	}

	public User create(Student student) {
		//return userDao.create(user);
		return studentRepository.save(student);
	}

	public User findUserById(int id) {
		//return userDao.findUserById(id);
		return studentRepository.findOne((long) id);
	}

	public User login(String email, String password) {
		//return userDao.login(email,password);
		//return userRepository.login(email,password);
		return studentRepository.findByEmailAndPassword(email,password);
	}

	public User update(Student student) {
		return studentRepository.save(student);
	}

	public void deleteUser(int id) {
		studentRepository.delete((long) id);
	}

	public User findUserByEmail(String email) {
		return studentRepository.findUserByEmail(email);
	}
	
	
}

