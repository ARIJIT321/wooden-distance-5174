package com.arijit.beans;

public class Admin {

	private int id;
	private boolean login;
	private String name;
	private String username;
	private String password;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, boolean login, String name, String username, String password) {
		super();
		this.id = id;
		this.login = login;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", login=" + login + ", name=" + name + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
}
