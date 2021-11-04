package com.pharmacy.pharmacyapp.DTO;

public class StockReturnDto {
	private Integer stock_return_id;
	private Integer stock_return_qty;
	private Float stock_return_total;
	private Integer stock_id;
	//private String stock_mf_date;
	//private String stock_exp_date;
	//private Integer stock_qty;
	//private String stock_rcv_date;
	private Integer supllierid;
	private String suplliername;
	private String supllieremail;
	private Integer paymentid;
	private Float paymenttotal;
	public StockReturnDto(Integer stock_return_id, Integer stock_return_qty, Float stock_return_total, Integer stock_id, Integer supllierid,
			String suplliername, String supllieremail, Integer paymentid, Float paymenttotal) {
		super();
		this.stock_return_id = stock_return_id;
		this.stock_return_qty = stock_return_qty;
		this.stock_return_total = stock_return_total;
		this.stock_id = stock_id;
		this.supllierid = supllierid;
		this.suplliername = suplliername;
		this.supllieremail = supllieremail;
		this.paymentid = paymentid;
		this.paymenttotal = paymenttotal;
	}
	public Integer getStock_return_id() {
		return stock_return_id;
	}
	public void setStock_return_id(Integer stock_return_id) {
		this.stock_return_id = stock_return_id;
	}
	public Integer getStock_return_qty() {
		return stock_return_qty;
	}
	public void setStock_return_qty(Integer stock_return_qty) {
		this.stock_return_qty = stock_return_qty;
	}
	public Float getStock_return_total() {
		return stock_return_total;
	}
	public void setStock_return_total(Float stock_return_total) {
		this.stock_return_total = stock_return_total;
	}
	public Integer getStock_id() {
		return stock_id;
	}
	public void setStock_id(Integer stock_id) {
		this.stock_id = stock_id;
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
	
	

}
