package com.ims.Client.Admin;

import java.util.Scanner;

import com.ims.DAOImpl.UserDAOImpl;

public class Admin {
	static UserDAOImpl userA= new UserDAOImpl();
	

	public static void adminPage() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("=================================");
			System.out.println("         1)UserList              ");
			System.out.println("         2)Category              ");
			System.out.println("         3)SubCategory           ");
			System.out.println("         4)Policy                ");
			System.out.println("         5)Back                  ");
			System.out.println("=================================");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				userA. viewAllUserInfo();
				break;
				
			case 2:
				Category.categoryDetails();
				break;
				
			case 3:
				SubCategory.subCategoryDetails();
				break;
				
			case 4:
				Policy.policyDetails();
				break;
				
			case 5:
				System.exit(0);
				break;
				
				default:
					System.out.println("Choose 1 to 5 Between");
				
			}
		}
	}

}
