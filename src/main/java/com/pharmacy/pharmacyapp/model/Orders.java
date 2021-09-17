package com.pharmacy.pharmacyapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_orders")
public class Orders {
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	@Column(name="order_date")
	public Date odate;
	@Column(name="order_qty")
	public Integer oqty;
	@Column(name="order_price")
	public float oprice;
	@Column(name="order_total")
	public float ototal;
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
	public Date getOdate() {
		return odate;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	public Integer getOqty() {
		return oqty;
	}
	public void setOqty(Integer oqty) {
		this.oqty = oqty;
	}
	public float getOprice() {
		return oprice;
	}
	public void setOprice(float oprice) {
		this.oprice = oprice;
	}
	public float getOtotal() {
		return ototal;
	}
	public void setOtotal(float ototal) {
		this.ototal = ototal;
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
