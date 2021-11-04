package com.pharmacy.pharmacyapp.DTO;

public class BrandDto {
	private Integer brandid;
	private String brandname;
	private Integer catid;
	private String catname;
	
	
	public BrandDto(Integer brandid, String brandname, Integer catid, String catname) {
		super();
		this.brandid = brandid;
		this.brandname = brandname;
		this.catid = catid;
		this.catname = catname;
	}


	public Integer getBrandid() {
		return brandid;
	}


	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}


	public String getBrandname() {
		return brandname;
	}


	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}


	public Integer getCatid() {
		return catid;
	}


	public void setCatid(Integer catid) {
		this.catid = catid;
	}


	public String getCatname() {
		return catname;
	}


	public void setCatname(String catname) {
		this.catname = catname;
	}
	
	
	

}
