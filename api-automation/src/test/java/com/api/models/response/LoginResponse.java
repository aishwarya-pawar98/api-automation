package com.api.models.response;

import java.util.List;


public class LoginResponse {

	private String Token;
	private String Type;
	private int id;
	private String Username;
	private String Email;
	private List<String> Roles;
	public LoginResponse() {
		
	}
	public LoginResponse(String token, String type, int id, String username, String email, List<String> roles) {
		super();
		Token = token;
		Type = type;
		this.id = id;
		Username = username;
		Email = email;
		Roles = roles;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<String> getRoles() {
		return Roles;
	}
	public void setRoles(List<String> roles) {
		Roles = roles;
	}
	@Override
	public String toString() {
		return "LoginResponse [Token=" + Token + ", Type=" + Type + ", id=" + id + ", Username=" + Username + ", Email="
				+ Email + ", Roles=" + Roles + "]";
	}
	
	
	

}
