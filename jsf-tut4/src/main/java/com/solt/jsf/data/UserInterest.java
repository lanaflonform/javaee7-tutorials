package com.solt.jsf.data;

import java.io.Serializable;
import java.util.Set;

public class UserInterest implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private String phone;
	private String email;
	private String comment;
	
	private Set<String> interests;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Set<String> getInterests() {
		return interests;
	}
	public void setInterests(Set<String> interests) {
		this.interests = interests;
	}

}
