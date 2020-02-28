package com.example.expertisetestoutline.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGISTRATION")
public class Registration {
	
	
	@Column(name = "id")
	@Id
	Integer id;
	
	
	@Column(name = "username")
	String userName;

	@Column(name = "userpassword")
	String userPassword;

	@Column(name = "usertype")
	String userRole;
	
//	@Column(name = "permissions")
//	List<String> permissions;
	
//	@Column(name = "permissions")
//	String[] permissions;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

//	public String[] getPermissions() {
//		return permissions;
//	}
//
//	public void setPermissions(String[] permissions) {
//		this.permissions = permissions;
//	}

//	public List<String> getPermissions() {
//		return permissions;
//	}
//
//	public void setPermissions(List<String> permissions) {
//		this.permissions = permissions;
//	}
//	
//	

	
	
	

}
