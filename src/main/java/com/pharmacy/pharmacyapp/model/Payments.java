package com.pharmacy.pharmacyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_payments")
public class Payments {
	@Id
	@Column(name="payments_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="payments_total")
	private float total;
	@Column(name="supllier_id")
	private Integer supllierid;
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Integer getSupllierid() {
		return supllierid;
	}
	public void setSupllierid(Integer supllierid) {
		this.supllierid = supllierid;
	}
	
	
	

}
