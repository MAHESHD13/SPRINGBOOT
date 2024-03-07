package com.web.model;

public class Users {
	private String name;
	private String password;
	private String email;
	private String mobile_no;
	private String address;
	
	// DEFAULT CONSTRUCTOR
	public Users() 
	{
		super();
	}
	
	// PARMATERISED CONSTRUCTOR
	public Users(String name, String password, String email, String mobile_no, String address) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobile_no = mobile_no;
		this.address = address;
	}
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//TOSTRING METHOD
	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", email=" + email + ", mobile_no=" + mobile_no
				+ ", address=" + address + "]";
	}

}
