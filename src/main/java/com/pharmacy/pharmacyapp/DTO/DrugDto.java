package com.pharmacy.pharmacyapp.DTO;

public class DrugDto {
	private Integer drugid;
	private String drugname;
	private Float drugprice;
	private Integer brandid;
	private String brandname;
	private Integer categoryid;
	private String categoryname;
	private Integer rackid;
	private String rackrow;
	
	
	public DrugDto(Integer drugid, String drugname, Float drugprice, Integer brandid, String brandname,
			Integer categoryid, String categoryname, Integer rackid, String rackrow) {
		super();
		this.drugid = drugid;
		this.drugname = drugname;
		this.drugprice = drugprice;
		this.brandid = brandid;
		this.brandname = brandname;
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.rackid = rackid;
		this.rackrow = rackrow;
	}
	public Integer getDrugid() {
		return drugid;
	}
	public void setDrugid(Integer drugid) {
		this.drugid = drugid;
	}
	public String getDrugname() {
		return drugname;
	}
	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}
	public Float getDrugprice() {
		return drugprice;
	}
	public void setDrugprice(Float drugprice) {
		this.drugprice = drugprice;
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
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Integer getRackid() {
		return rackid;
	}
	public void setRackid(Integer rackid) {
		this.rackid = rackid;
	}
	public String getRackrow() {
		return rackrow;
	}
	public void setRackrow(String rackrow) {
		this.rackrow = rackrow;
	}
	
	

}
