package com.ims.model;

public class PolicyDetails {
	
	private int categoryid;
	private int subcategoryid;
	private int policyid;
	private String categoryname;
	private String subcategoryname;
	private String policyname;
	
	public PolicyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public PolicyDetails(int categoryid, int subcategoryid, int policyid, String categoryname, String subcategoryname,
//			String policyname) {
//		super();
//		this.categoryid = categoryid;
//		this.subcategoryid = subcategoryid;
//		this.policyid = policyid;
//		this.categoryname = categoryname;
//		this.subcategoryname = subcategoryname;
//		this.policyname = policyname;
//	}
	
	
	public int getCategoryid() {
		return categoryid;
	}
	public PolicyDetails(int policyid, String categoryname, String subcategoryname, String policyname) {
	super();
	this.policyid = policyid;
	this.categoryname = categoryname;
	this.subcategoryname = subcategoryname;
	this.policyname = policyname;
}
	
	
	
	public PolicyDetails(int categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public int getSubcategoryid() {
		return subcategoryid;
	}
	public void setSubcategoryid(int subcategoryid) {
		this.subcategoryid = subcategoryid;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getSubcategoryname() {
		return subcategoryname;
	}
	public void setSubcategoryname(String subcategoryname) {
		this.subcategoryname = subcategoryname;
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	
	
	

}
