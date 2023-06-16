package com.mymovieplan.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class administrators {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adminId")
	private int adminId;
	@Column(name = "username")
	private String userName;
	@Column(name="passwaord")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name ="role")
	private String role;
	
	public administrators() {
		// TODO Auto-generated constructor stub
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "administrators [adminId=" + adminId + ", userName=" + userName + ", password=" + password + ", email="
				+ email + ", role=" + role + "]";
	}
	
}
