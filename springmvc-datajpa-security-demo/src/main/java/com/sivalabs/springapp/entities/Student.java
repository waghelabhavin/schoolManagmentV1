package com.sivalabs.springapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Student")
@Table(name="STUDENT")
public class Student extends User{
	
	private int standard;
	private String division;
	
	@ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="parent_id")
    private Parents parent;

	
	public User getParent() {
		return parent;
	}
	
	public void setParent(Parents parent) {
		this.parent = parent;
	}
	
	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
   
}
