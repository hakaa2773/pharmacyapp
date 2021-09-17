package com.pharmacy.pharmacyapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_return")
public class Returns {
	@Id
	@Column(name="return_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	@Column(name="return_qty")
	public Integer qty;
	@Column(name="return_date")
	public Date rdate;
	@Column(name="return_price")
	public float price;
	@Column(name="return_total")
	public float total;
	@Column(name="invoice_id")
	public Integer invoiceid;
	@Column(name="drug_id")
	public Integer drugid;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Integer getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(Integer invoiceid) {
		this.invoiceid = invoiceid;
	}
	public Integer getDrugid() {
		return drugid;
	}
	public void setDrugid(Integer drugid) {
		this.drugid = drugid;
	}
	
	
	

}
