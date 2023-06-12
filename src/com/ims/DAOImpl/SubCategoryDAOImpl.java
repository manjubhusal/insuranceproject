package com.ims.DAOImpl;

import java.util.List;

import com.ims.model.PolicyDetails;

public class SubCategoryDAOImpl extends PolicyDAOImpl {

	
	
	public void addSubCategory() {
		int k = 1;
		while (k == 1) {
			System.out.println("Enter SubCategory ID");
			int sid = sc.nextInt();
			System.out.println("Enter SubCategory Name");
			String sname = sc.next();
			

			// initializing value at object creation time

			PolicyDetails sdetails = new PolicyDetails(sid, sname);
			addSubCategory.add(sdetails);
			System.out.println("SubCategory Added Successfully");
			System.out.println("Do you want to add one more subcategory 1)Yes 2) No");
			k = sc.nextInt();
	}

	}
	
	public List<PolicyDetails> viewSubCategory(){
		return addSubCategory;
	}
	
	public void updateSubCategory(int sid) {
		
		int k=0;
		for(PolicyDetails sdetails: addSubCategory) {
			if(sdetails.getSubcategoryid()==sid)
			{
				System.out.println("Do you want to modify Name of SubCategory");
			
				String ssname = sc.next();
				sdetails.setSubcategoryname(ssname);;
				System.out.println("SubCategory Name is Updated");
				
			}
			k++;
		}
		if(k==0)
			System.out.println("Given SubCategory Doesnot Exist");
	}
	
	public void deleteSubCategory(int sid) {
		
		int k=0;
		for(PolicyDetails sdetails: addSubCategory) {
			if(sdetails.getSubcategoryid()==sid)
				addSubCategory.remove(sdetails);
			System.out.println("SubCategory Deleted Successfully");
			k++;
		}
		if(k==0)
			System.out.println("Given ID doesnot Exist");
		
	}
}
