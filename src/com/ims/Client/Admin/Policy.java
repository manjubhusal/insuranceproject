package com.ims.Client.Admin;

import java.util.Scanner;

import com.ims.DAOImpl.PolicyDAOImpl;

public class Policy {
	static PolicyDAOImpl pImpl =new PolicyDAOImpl();
	public static void policyDetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("==============================");
		System.out.println("          1)AddPolicy       ");
		System.out.println("          2)ViewPolicy      ");
		System.out.println("          3)UpdatePolicy   ");
		System.out.println("          4)DeletePolicy    ");
		System.out.println("          5)Back              ");
		System.out.println("==============================");
		
		System.out.println("Enter the Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			 pImpl.addPolicy();
			break;
			
		case 2:
			 pImpl.viewPolicy();
			break;
			
		case 3:
			System.out.println("Enter Policy Id to update");
			int upid= sc.nextInt();
			 pImpl.updatePolicy(upid);
			break;
			
		case 4:
			System.out.println("Enter Policy Id to delete");
			int apid= sc.nextInt();
			 pImpl.deletePolicy(apid);
			break;
			
		case 5:
			Admin.adminPage();
			break;
			
			default:
				System.out.println("Choose 1 to 5 Between");
			
		}
		
		
		}
		
	}

}
