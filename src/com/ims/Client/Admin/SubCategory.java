package com.ims.Client.Admin;

import java.util.Scanner;

import com.ims.DAOImpl.SubCategoryDAOImpl;

public class SubCategory {
	static SubCategoryDAOImpl subCategoryA= new SubCategoryDAOImpl();

	public static void subCategoryDetails() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("==============================");
		System.out.println("          1)AddSubCategory       ");
		System.out.println("          2)ViewSubCategory      ");
		System.out.println("          3)UpdateSubCategory    ");
		System.out.println("          4)DeleteSubCategory    ");
		System.out.println("          5)Back              ");
		System.out.println("==============================");
		
		System.out.println("Enter the Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			subCategoryA.addSubCategory();
			break;
			
		case 2:
			subCategoryA.viewSubCategory();
			break;
			
		case 3:
			System.out.println("Enter SubCategory Id to update");
			int suid= sc.nextInt();
			subCategoryA.updateSubCategory(suid);
			break;
			
		case 4:
			System.out.println("Enter SubCategory Id to delete");
			int sdid= sc.nextInt();
			subCategoryA.deleteCategory(sdid);
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
