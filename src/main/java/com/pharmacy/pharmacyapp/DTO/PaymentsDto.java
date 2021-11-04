package com.pharmacy.pharmacyapp.DTO;

public class PaymentsDto {
	private Integer paymentid;
	private Float paymenttotal;
	private Integer supllierid;
	private String suplliername;
	private String supllieremail;
	public PaymentsDto(Integer paymentid, Float paymenttotal, Integer supllierid, String suplliername,
			String supllieremail) {
		super();
		this.paymentid = paymentid;
		this.paymenttotal = paymenttotal;
		this.supllierid = supllierid;
		this.suplliername = suplliername;
		this.supllieremail = supllieremail;
	}
	public Integer getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(Integer paymentid) {
		this.paymentid = paymentid;
	}
	public Float getPaymenttotal() {
		return paymenttotal;
	}
	public void setPaymenttotal(Float paymenttotal) {
		this.paymenttotal = paymenttotal;
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
	

}
