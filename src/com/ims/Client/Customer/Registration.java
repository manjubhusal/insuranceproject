package com.ims.Client.Customer;

import java.util.Scanner;

import com.ims.DAOImpl.UserDAOImpl;

public class Registration {

	static UserDAOImpl userDAO= new UserDAOImpl();
	public static void Customermenu() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("=========================================");
			System.out.println("        1)Register                       ");
			System.out.println("        2)VerificationEmailAnd Password  ");
			System.out.println("        3)ForgotPassword                 ");
			System.out.println("        4)BackHomePage                   ");
			System.out.println("=========================================");
			System.out.println("Enter the Choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				userDAO.addCustomer();
				break;
				
			case 2:
				System.out.println("Enter email:");
				String email=sc.next();
				System.out.println("Enter Password");
				String pass=sc.next();
				if(userDAO.AuthenticationEmailandPassword(email, pass)!=false) {
					System.out.println("UserVerified");
				}
				break;
				
			case 3:
				System.out.println("Enter email for password recovery");
				String em= sc.next();
				if(userDAO.getPassword(em) !=null) {
					System.out.println("Password:" +userDAO.getPassword(em));
				}
				
				break;
				
			case 4:
				System.exit(0);
				
				default:
					System.out.println("Enter 1 to 4 Between");
				
			
			}
;
			}
		

	}

}
