package com.mymovieplan.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Uid")
	private int Uid;
	@Column(name="firstName")
	private String firstName;
	@Column(name="middleName")
	private String middleName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="userName")
	private String userName;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="country")
	private String country;
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Users [Uid=" + Uid + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", userName=" + userName + ", email=" + email + ", password=" + password + ", country="
				+ country + "]";
	}
	
}