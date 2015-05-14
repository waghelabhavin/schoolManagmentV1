package com.sivalabs.springapp.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sivalabs.springapp.entities.Menu;
import com.sivalabs.springapp.entities.Role; 

public interface MenuRepository extends JpaRepository<Menu, Serializable> {
	List<Menu> findMenuByRoleIdAndParentId(Role role, Menu menu);
}
