package com.assignement.login.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name="user_table1")
public class RegistationDTO  implements Serializable {
	
	@Id
	@GenericGenerator(name="u_id",strategy="increment")
	@GeneratedValue(generator="u_id")
	@Column(name="id")
    private int id;
	@Column(name="myName")
    private String myName;
	@Column(name="email")
	private String email;
	@Column(name="pass")
    private String pass;
	@Column(name="phNm")
    private String phNm;
	@Column(name="gender")
    private String gender;
	@Column(name="knows")
    private String knows;
	@Column(name="remember")
    private String remember;
    
    public RegistationDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhNm() {
		return phNm;
	}

	public void setPhNm(String phNm) {
		this.phNm = phNm;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getKnows() {
		return knows;
	}

	public void setKnows(String knows) {
		this.knows = knows;
	}

	public String getRemember() {
		return remember;
	}

	public void setRemember(String remember) {
		this.remember = remember;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "RegistationDTO [id=" + id + ", myName=" + myName + ", pass=" + pass + ", phNm=" + phNm + ", gender="
				+ gender + ", knows=" + knows + ", remember=" + remember + "]";
	}

	
    
}
