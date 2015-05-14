package com.sivalabs.springapp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DAILYTASK")
public class DailyTask {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String describeDailyTask;
	private String referance;
	private String comments;
	
	private String standerd; 
	private String division; 
	private String activityType; 
	private String subject; 
 	
	private Date createdOn;
	private Date completionDate;
	
	public String getReferance() {
		return referance;
	}
	public void setReferance(String referance) {
		this.referance = referance;
	}
	public String getStanderd() {
		return standerd;
	}
	public void setStanderd(String standerd) {
		this.standerd = standerd;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private Date assignDate;
	
	 
	 
	public String getRef() {
		return referance;
	}
	public void setRef(String referance) {
		this.referance = referance;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	public Date getAssignDate() {
		return assignDate;
	}
	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}
	public int getId() {
		return id;
	}
	public String getDescribeDailyTask() {
		return describeDailyTask;
	}
	public void setDescribeDailyTask(String describeDailyTask) {
		this.describeDailyTask = describeDailyTask;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
