package com.ims.Client.Admin;

import java.util.Scanner;

import com.ims.DAOImpl.CategoryDAOImpl;

public class Category {
	static CategoryDAOImpl categoryA= new CategoryDAOImpl();
	public static void categoryDetails() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("==============================");
		System.out.println("          1)AddCategory       ");
		System.out.println("          2)ViewCategory      ");
		System.out.println("          3)UpdateCategory    ");
		System.out.println("          4)DeleteCategory    ");
		System.out.println("          5)Back              ");
		System.out.println("==============================");
		
		System.out.println("Enter the Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			categoryA.addCategory();
			break;
			
		case 2:
			categoryA.viewCategory();
			break;
			
		case 3:
			System.out.println("Enter Category Id to update");
			int uid= sc.nextInt();
			categoryA.updateCategory(uid);
			break;
			
		case 4:
			System.out.println("Enter Category Id to delete");
			int did= sc.nextInt();
			categoryA.deleteCategory(did);
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
