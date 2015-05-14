package com.sivalabs.springapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Parents")
@Table(name="PARENTS")
public class Parents extends User{
	
	private String temp;

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	@OneToMany(mappedBy="parent")
    private Set<Student> child = new HashSet<Student>();

	public Set<Student> getChild() {
		return child;
	}

	public void setChild(Set<Student> child) {
		this.child = child;
	}
	
}
