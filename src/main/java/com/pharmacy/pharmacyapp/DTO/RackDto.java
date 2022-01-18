package com.pharmacy.pharmacyapp.DTO;

public class RackDto {
	private Integer rackid;
	private String rackrow;
	private Integer categoryid;
	private String categoryname;
	private Integer brandid;
	private String brandname;
	public RackDto(Integer rackid, String rackrow, Integer categoryid, String categoryname, Integer brandid,
			String brandname) {
		super();
		this.rackid = rackid;
		this.rackrow = rackrow;
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.brandid = brandid;
		this.brandname = brandname;
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
	
	

	
	

}
