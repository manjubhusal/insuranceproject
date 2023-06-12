package com.ims.DAO;

import java.util.List;

import com.ims.model.PolicyDetails;

public interface PolicyDetailsDAO {
	
	public void addCategory();
	List<PolicyDetails> viewCategory();
	PolicyDetails viewCategory(int cid);
	void updateCategory(int cid);
	void deleteCategory(int cid);
	
	public void addSubCategory();
	List<PolicyDetails> viewSubCategory();
	PolicyDetails viewSubCategory(int sid);
	void updateSubCategory(int sid);
	void deleteSubCategory(int sid);
	
	public void addPolicy();
	List<PolicyDetails> viewPolicy();
	PolicyDetails viewPolicy(int pid);
	void updatePolicy(int pid);
	void deletePolicy(int pid);

}
