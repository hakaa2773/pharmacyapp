package com.pharmacy.pharmacyapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_stock")
public class Stock {
	@Id
	@Column(name="stock_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="stock_mf_date")
	private Date mfdate;
	@Column(name="stock_exp_date")
	private Date expdate;
	@Column(name="stock_qty")
	private Integer sqty;
	@Column(name="stock_rcv_date")
	private Date srdate;
	@Column(name="drug_id")
	public Integer drugid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMfdate() {
		return mfdate;
	}
	public void setMfdate(Date mfdate) {
		this.mfdate = mfdate;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	public Integer getSqty() {
		return sqty;
	}
	public void setSqty(Integer sqty) {
		this.sqty = sqty;
	}
	public Date getSrdate() {
		return srdate;
	}
	public void setSrdate(Date srdate) {
		this.srdate = srdate;
	}
	public Integer getDrugid() {
		return drugid;
	}
	public void setDrugid(Integer drugid) {
		this.drugid = drugid;
	}
	
	
	

}
