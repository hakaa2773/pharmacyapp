package com.pharmacy.pharmacyapp.DTO;

public class OrdersDto {
	private Integer order_id;
	private String order_date;
	private Integer order_qty;
	private Float order_price;
	private Float order_total;
	private Integer invoice_id;
	private String  invoice_date;
	private Float invoice_total;
	private Integer drug_id;
	private String drug_name;
	private Float drug_price;
	public OrdersDto(Integer order_id, String order_date, Integer order_qty, Float order_price, Float order_total,
			Integer invoice_id, String invoice_date, Float invoice_total, Integer drug_id, String drug_name,
			Float drug_price) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.order_qty = order_qty;
		this.order_price = order_price;
		this.order_total = order_total;
		this.invoice_id = invoice_id;
		this.invoice_date = invoice_date;
		this.invoice_total = invoice_total;
		this.drug_id = drug_id;
		this.drug_name = drug_name;
		this.drug_price = drug_price;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public Integer getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(Integer order_qty) {
		this.order_qty = order_qty;
	}
	public Float getOrder_price() {
		return order_price;
	}
	public void setOrder_price(Float order_price) {
		this.order_price = order_price;
	}
	public Float getOrder_total() {
		return order_total;
	}
	public void setOrder_total(Float order_total) {
		this.order_total = order_total;
	}
	public Integer getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(Integer invoice_id) {
		this.invoice_id = invoice_id;
	}
	public String getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	public Float getInvoice_total() {
		return invoice_total;
	}
	public void setInvoice_total(Float invoice_total) {
		this.invoice_total = invoice_total;
	}
	public Integer getDrug_id() {
		return drug_id;
	}
	public void setDrug_id(Integer drug_id) {
		this.drug_id = drug_id;
	}
	public String getDrug_name() {
		return drug_name;
	}
	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}
	public Float getDrug_price() {
		return drug_price;
	}
	public void setDrug_price(Float drug_price) {
		this.drug_price = drug_price;
	}
	
	

}
