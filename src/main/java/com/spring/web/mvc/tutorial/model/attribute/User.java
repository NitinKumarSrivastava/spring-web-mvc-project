package com.spring.web.mvc.tutorial.model.attribute;

public class User {
	
	private String userName;
	private String email;
	private String userPassword;
	
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
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", userPassword=" + userPassword + "]";
	}
	
	

}
