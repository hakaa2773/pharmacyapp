package com.pharmacy.pharmacyapp.DTO;

public class SupplierDto {
	private Integer supllierid;
	private String suplliername;
	private String supllieremail;
	private Integer brandid;
	private String brandname;
	public SupplierDto(Integer supllierid, String suplliername, String supllieremail, Integer brandid,
			String brandname) {
		super();
		this.supllierid = supllierid;
		this.suplliername = suplliername;
		this.supllieremail = supllieremail;
		this.brandid = brandid;
		this.brandname = brandname;
	}
	public Integer getSupllierid() {
		return supllierid;
	}
	public void setSupllierid(Integer supllierid) {
		this.supllierid = supllierid;
	}
	public String getSuplliername() {
		return suplliername;
	}
	public void setSuplliername(String suplliername) {
		this.suplliername = suplliername;
	}
	public String getSupllieremail() {
		return supllieremail;
	}
	public void setSupllieremail(String supllieremail) {
		this.supllieremail = supllieremail;
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
