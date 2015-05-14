package com.sivalabs.springapp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MENU")
public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	
	@ManyToOne
	@JoinColumn(name="Parent_id")
	private Menu parentId;
	 
	@ManyToMany 
	private List<Menu> childId;
	
	public List<Menu> getChildId() {
		return childId;
	}

	public void setChildId(List<Menu> childId) {
		this.childId = childId;
	}

	@ManyToOne
	@JoinColumn(name="role_id")
	private Role roleId;
	
	private String name; 
	private String title; 
	private String description; 
	private String page;
	private String action;
	private String target;
	private String onClick; 
	 
 
	public int getId() {
		return id;
	}
 
	public Role getRoleId() {
		return roleId;
	}

	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}

	public void setId(int id) {
		this.id = id;
	}  

	public Menu getParentId() {
		return parentId;
	}

	public void setParentId(Menu parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getOnClick() {
		return onClick;
	}

	public void setOnClick(String onClick) {
		this.onClick = onClick;
	}
 
}
