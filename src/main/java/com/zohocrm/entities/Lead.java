package com.zohocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "leads")
public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", length = 45, nullable = false)
    @NotEmpty(message = "First Name should not be empty")
	private String firstName;
	
	@Column(name = "last_name", length = 45, nullable = false)
	@NotEmpty(message = "Last Name should not be empty")
	private String lastName;
	
	@Column(name = "email", length = 125, nullable = false, unique = true)
	@Email(message = "Insert an valid email")
	private String email;
	
	@Column(name = "mobile", length = 10, nullable = false, unique = true)
	@Digits(message="Number should contain 10 digits.", fraction = 0, integer = 10)
	private long mobile;
	private String source;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
}
