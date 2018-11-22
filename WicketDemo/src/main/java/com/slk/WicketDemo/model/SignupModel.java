package com.slk.WicketDemo.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

public class SignupModel implements Serializable{
	
	private String user;
	private String pass;
	private String email;
	private String gender;
	private Collection<String> languages;
	private String city;
	private String address;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Collection<String> getLanguages() {
		return languages;
	}
	public void setLanguages(Collection<String> languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "SignupModel [user=" + user + ", pass=" + pass + ", email=" + email + ", gender=" + gender
				+ ", languages=" + languages + ", city=" + city + ", address=" + address + "]";
	}
	
	
	

}
