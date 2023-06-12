package com.ims.DAOImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.ims.DAO.UserDAO;
import com.ims.model.User;

public class UserDAOImpl implements UserDAO {
	Scanner sc=new Scanner(System.in);
	static List<User> addUsers = new LinkedList<>();
	static List<User> policyRequestList = new LinkedList<>();
	



	public void addCustomer() {
		// TODO Auto-generated method stub
		int k = 1;
		while (k == 1) {
			System.out.println("Enter User ID");
			int uid = sc.nextInt();
			System.out.println("Enter UserName");
			String name = sc.next();
			System.out.println("Enter User Address");
			String address = sc.next();
			System.out.println("Enter Phone Number");
			long phone= sc.nextInt();
			System.out.println("Enter User email");
			String email= sc.next();
			System.out.println("Enter Password");
			String password= sc.next();

			// initializing value at object creation time

			User user= new User(uid, name, address, phone, email, password);
			addUsers.add(user);
			System.out.println("User Added Successfully");
			System.out.println("Do you want to add one more User 1)Yes 2) No");
			k = sc.nextInt();
			}

	}

	
	public List<User> viewAllUserInfo() {
		// TODO Auto-generated method stub
		return addUsers;
	}

	
	public boolean AuthenticationEmailandPassword(String email, String password) {
		// TODO Auto-generated method stub
		int k=0;
		for(User usr:addUsers) {
			if((usr.getEmail().equals(email)) && (usr.getPassword().equals(password))) {
				k++;
				return true;
			}else
				System.out.println("You have entered wrong username and password");
			
			
		}
		if(k==0)
			System.out.println("User not found");
		return false;
	}


	public String getPassword(String email) {
		// TODO Auto-generated method stub
		int k=0;
		for (User usr: addUsers) {
			if((usr.getEmail().equals(email))) {
				String pass=usr.getPassword();
				k++;
				return pass;
			}
		}
		if(k==0)
			System.out.println("User not Found");
		
		return null;
	}

	
	public List<User> policyRequest(String email){
		for(User usr: addUsers) {
			if(usr.getEmail().equals(email)) {
				int id=usr.getUid();
				String name=usr.getUname();
				String address=usr.getAddress();
				long phone=usr.getPhone();
				String eemail=usr.getEmail();
				String password=usr.getPassword();
				User requestUser=new User(id, name, address, phone, eemail, password);
				policyRequestList.add(requestUser);
			}
		}
		return policyRequestList;
	}


	@Override
	public List<User> policyActivate(String email, int policyID) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> policyCancel(String email, int policyID) {
		// TODO Auto-generated method stub
		return null;
	}
	}
