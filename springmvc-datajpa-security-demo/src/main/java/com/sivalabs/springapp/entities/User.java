/**
 * 
 */
package com.sivalabs.springapp.entities;

import java.util.Date; 

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne; 
import javax.persistence.Table;


/**
 * @author katsi02
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "user_type")
@Table(name="USERS")
public class User 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable=false, unique=true)
	private String email;

	@Column(nullable=false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role roles;
	
	private String contactNo;

	private String userName;
	private String sequrityQuestion;
	private String answer;
	private String firstName;
	private String lastName;
	private Date createdOn;
	private Date modifiedOn;
	
	public String getContactNo() {
		return contactNo;
	}
	
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
    
	public User() {
	}

	public User(int id, String userName, String email, String password, String firstName, String sequrityQuestion, String lastName, String answer, Date createdOn, Date modifiedOn) {
		this.id = id;
		this.userName= userName;
		this.email = email;
		this.password = password;
		this.firstName= firstName;
		this.lastName= lastName;
		this.sequrityQuestion= sequrityQuestion;
		this.answer= answer;
		this.createdOn = createdOn;
		this.modifiedOn = modifiedOn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName+ ", firstName=" + firstName +", lastName="+lastName+"]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	public Role getRoles() {
		return roles;
	}

	public void setRoles(Role roles) {
		this.roles = roles;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSequrityQuestion() {
		return sequrityQuestion;
	}

	public void setSequrityQuestion(String sequrityQuestion) {
		this.sequrityQuestion = sequrityQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
}
