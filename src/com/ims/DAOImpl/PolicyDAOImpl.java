package com.ims.DAOImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.ims.DAO.PolicyDetailsDAO;
import com.ims.model.PolicyDetails;
import com.ims.model.User;

public class PolicyDAOImpl implements PolicyDetailsDAO {
	Scanner sc=new Scanner(System.in);
	List<PolicyDetails> addCategory = new LinkedList<>();
	List<PolicyDetails> addSubCategory = new LinkedList<>();
	List<PolicyDetails> addPolicy = new LinkedList<>();

	@Override
	public void addCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PolicyDetails> viewCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PolicyDetails viewCategory(int categoryid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory(int categoryid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCategory(int categoryid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSubCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PolicyDetails> viewSubCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PolicyDetails viewSubCategory(int subcategoryid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSubCategory(int subcategoryid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSubCategory(int subcategoryid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPolicy() {
		// TODO Auto-generated method stub
		int k = 1;
		while (k == 1) {
			System.out.println("Enter Policy ID");
			int pid = sc.nextInt();
			System.out.println(addCategory);
			System.out.println("Choose  Category List");
			String cat = sc.next();
			System.out.println(addSubCategory);
			System.out.println("Choose Subcategory");
			String sCat = sc.next();
			System.out.println("Enter Policy Name");
			String pname=sc.next();
			

			// initializing value at object creation time

			PolicyDetails pd= new PolicyDetails(pid, cat, sCat, pname);
			addPolicy.add(pd);
			
			System.out.println("Policy Added Successfully");
			System.out.println("Do you want to add one more Policy 1)Yes 2) No");
			k = sc.nextInt();
			}
	}

	@Override
	public List<PolicyDetails> viewPolicy() {
		// TODO Auto-generated method stub
		return addPolicy;
	}

	@Override
	public PolicyDetails viewPolicy(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePolicy(int pid) {
		// TODO Auto-generated method stub
		int k=0;
		for(PolicyDetails pd: addPolicy) {
			if(pd.getPolicyid()==pid) {
			System.out.println("Do you want to modify 1)Policy 2)Category 3)SubCategory");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Policy Name");
				String pname = sc.next();
				pd.setPolicyname(pname);
				System.out.println("Policy Name is Updated");
				break;
			case 2:
				System.out.println("Enter Category Name");
				String cname = sc.next();
				pd.setCategoryname(cname);
				System.out.println("Category Name is Updated");
				break;
			case 3:
				System.out.println("Enter SubCategory Name");
				String subname = sc.next();
				pd.setSubcategoryname(subname);
				System.out.println("SubCategory Name is Updated");
				break;
			default:
				System.out.println("Choose 1 to 3 Between");
			}
			k++;
		}
		}
	}

	@Override
	public void deletePolicy(int pid) {
		// TODO Auto-generated method stub
		int k=0;
		for(PolicyDetails pd: addPolicy) {
			if(pd.getPolicyid()== pid)
				addPolicy.remove(pd);
			System.out.println("Policy Deleted Successfully");
			k++;
		}
		if(k==0)
			System.out.println("Given ID doesnot Exist");

	}

}
