package com.assignement.login.dto;

import java.io.Serializable;


public class UpdateDTO implements Serializable {
	
	private String email;
	
	private String phNm;
	
	public UpdateDTO() {
		System.out.println(this.getClass().getSimpleName()+"crated");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPhNm() {
		return phNm;
	}

	public void setPhNm(String phNm) {
		this.phNm = phNm;
	}

	@Override
	public String toString() {
		return "UpdateDTO [email=" + email + ", phNm=" + phNm + "]";
	}
	



}
