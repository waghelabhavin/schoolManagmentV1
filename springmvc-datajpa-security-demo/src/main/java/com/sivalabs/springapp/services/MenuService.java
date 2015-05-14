package com.sivalabs.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.springapp.entities.Menu;  
import com.sivalabs.springapp.entities.Role;
import com.sivalabs.springapp.repositories.MenuRepository; 

@Service
@Transactional
public class MenuService {
	@Autowired
	private MenuRepository menuRepository;
	
	/*
	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	*/
	public List<Menu> findAll() {
		//return userDao.findAll();
		return menuRepository.findAll();
	}

	public Menu create(Menu menu) {
		//return userDao.create(user);
		return menuRepository.save(menu);
	}

	public Menu findUserById(int id) {
		//return userDao.findUserById(id);
		return menuRepository.findOne(id);
	} 

	public Menu update(Menu menu) {
		return menuRepository.save(menu);
	}

	public void deleteUser(int id) {
		menuRepository.delete(id);
	} 
	
	public List<Menu> findMenu(Role role, Menu menu){
		return menuRepository.findMenuByRoleIdAndParentId(role, menu);
	}
}
