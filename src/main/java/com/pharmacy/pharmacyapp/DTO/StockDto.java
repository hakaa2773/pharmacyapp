package com.pharmacy.pharmacyapp.DTO;


public class StockDto {
	private Integer stock_id;
	private String stock_mf_date;
	private String stock_exp_date;
	private Integer stock_qty;
	private String stock_rcv_date;
	private Integer drugid;
	private String drugname;
	private Float drugPrice;
	public StockDto(Integer stock_id, String stock_mf_date, String stock_exp_date, Integer stock_qty,
			String stock_rcv_date, Integer drugid, String drugname, Float drugPrice) {
		super();
		this.stock_id = stock_id;
		this.stock_mf_date = stock_mf_date;
		this.stock_exp_date = stock_exp_date;
		this.stock_qty = stock_qty;
		this.stock_rcv_date = stock_rcv_date;
		this.drugid = drugid;
		this.drugname = drugname;
		this.drugPrice = drugPrice;
	}
	public Integer getStock_id() {
		return stock_id;
	}
	public void setStock_id(Integer stock_id) {
		this.stock_id = stock_id;
	}
	public String getStock_mf_date() {
		return stock_mf_date;
	}
	public void setStock_mf_date(String stock_mf_date) {
		this.stock_mf_date = stock_mf_date;
	}
	public String getStock_exp_date() {
		return stock_exp_date;
	}
	public void setStock_exp_date(String stock_exp_date) {
		this.stock_exp_date = stock_exp_date;
	}
	public Integer getStock_qty() {
		return stock_qty;
	}
	public void setStock_qty(Integer stock_qty) {
		this.stock_qty = stock_qty;
	}
	public String getStock_rcv_date() {
		return stock_rcv_date;
	}
	public void setStock_rcv_date(String stock_rcv_date) {
		this.stock_rcv_date = stock_rcv_date;
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
	public Float getDrugPrice() {
		return drugPrice;
	}
	public void setDrugPrice(Float drugPrice) {
		this.drugPrice = drugPrice;
	}
	
	
	
	
	
	

}
