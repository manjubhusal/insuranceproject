package com.ims.DAOImpl;

import java.util.List;

import com.ims.model.PolicyDetails;

public class CategoryDAOImpl extends PolicyDAOImpl {

	public void addCategory() {
		int k = 1;
		while (k == 1) {
			System.out.println("Enter Category ID");
			int cid = sc.nextInt();
			System.out.println("Enter Category Name");
			String cname = sc.next();
			

			// initializing value at object creation time

			PolicyDetails cdetails = new PolicyDetails(cid, cname);
			addCategory.add(cdetails);
			System.out.println("Category Added Successfully");
			System.out.println("Do you want to add one more category 1)Yes 2) No");
			k = sc.nextInt();
	}

	}
	
	public List<PolicyDetails> viewCategory(){
		return addCategory;
	}
	
	public void updateCategory(int cid) {
		
		int k=0;
		for(PolicyDetails cdetails: addCategory) {
			if(cdetails.getCategoryid()==cid)
			{
				System.out.println("Do you want to modify Name of Category");
			
				String name = sc.next();
				cdetails.setCategoryname(name);
				System.out.println("Category Name is Updated");
				
			}
			k++;
		}
		if(k==0)
			System.out.println("Given Category Doesnot Exist");
	}
	
	public void deleteCategory(int cid) {
		
		int k=0;
		for(PolicyDetails cdetails: addCategory) {
			if(cdetails.getCategoryid()==cid)
				addCategory.remove(cdetails);
			System.out.println("Category Deleted Successfully");
			k++;
		}
		if(k==0)
			System.out.println("Given ID doesnot Exist");
		
	}
	
}
