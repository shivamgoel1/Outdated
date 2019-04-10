package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserLogin {
	public UserLogin(){	
	}
	
	@Id
	@Column(name="email",length=50)
	String email;
	
	@Column(name="password",length=100)
	String password;
	
	@Column(name="authorities",length=20)
	String authority;
	
	@Column(name="id")
	int id;

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

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserLogin(String email, String password, String authority, int id) {
		super();
		this.email = email;
		this.password = password;
		this.authority = authority;
		this.id = id;
	}

	
}
