package com.ims.Client.Customer;

import java.util.Scanner;

import com.ims.DAOImpl.CategoryDAOImpl;
import com.ims.DAOImpl.PolicyDAOImpl;
import com.ims.DAOImpl.SubCategoryDAOImpl;
import com.ims.DAOImpl.UserDAOImpl;


public class Home {
	
	static PolicyDAOImpl policyC = new PolicyDAOImpl();
	static CategoryDAOImpl categoryC= new CategoryDAOImpl();
	static SubCategoryDAOImpl subCategoryC= new SubCategoryDAOImpl();
	static UserDAOImpl userC= new UserDAOImpl();
	
	public static void customerDetails() {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("===================================");
			System.out.println("           1)View Category         ");
			System.out.println("           2)View SubCategory      ");
			System.out.println("           3)View Policy           ");
			System.out.println("           4)Registration          ");
			System.out.println("           5)Back                  ");
			System.out.println("===================================");   
		
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				categoryC.viewCategory();
				break;
				
			case 2:
				subCategoryC.viewSubCategory();
				break;
				
			case 3: 
				policyC.viewPolicy();
				break;
				
			case 4:
				Registration.Customermenu();
				break;
				
			case 5:
				System.exit(0);
				
				default:
					System.out.println("Choose 1 to 5 Between")
;			}
		}
		

	}

}
