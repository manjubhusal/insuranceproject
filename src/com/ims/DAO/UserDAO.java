package com.ims.DAO;

import java.util.List;

import com.ims.model.User;


public interface UserDAO {
	
	public void addCustomer();
	public List<User> viewAllUserInfo();
	public boolean AuthenticationEmailandPassword(String email, String password);
	String getPassword(String email);
	public List<User> policyRequest(String email);
	public List<User> policyActivate(String email, int policyID);
	public List<User> policyCancel(String email, int policyID);


	
	
	

}
