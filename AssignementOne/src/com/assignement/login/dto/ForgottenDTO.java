package com.assignement.login.dto;

import java.io.Serializable;



public class ForgottenDTO implements Serializable {
	
	private String email;
	private String pass;
	
	public ForgottenDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "ForgottenDTO [email=" + email + ", pass=" + pass + "]";
	}

	
	

}
