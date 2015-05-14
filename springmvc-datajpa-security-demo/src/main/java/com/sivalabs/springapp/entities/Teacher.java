package com.sivalabs.springapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Teacher")
@Table(name="TEACHER")
public class Teacher extends User{
	private String classTeacherOf;
	private String classDivisionTeacherOf;
	
	public String getClassTeacherOf() {
		return classTeacherOf;
	}
	public void setClassTeacherOf(String classTeacherOf) {
		this.classTeacherOf = classTeacherOf;
	}
	public String getClassDivisionTeacherOf() {
		return classDivisionTeacherOf;
	}
	public void setClassDivisionTeacherOf(String classDivisionTeacherOf) {
		this.classDivisionTeacherOf = classDivisionTeacherOf;
	}
	
	
}
