package com.ims.model;

public class User {
	
	private int uid;
	private String uname;
	private String address;
	private long phone;
	private String email;
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String address, long phone, String email, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	public User(int uid, String uname, String address, long phone, String email) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
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
	
	
	

}
