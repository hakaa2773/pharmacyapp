package com.pharmacy.pharmacyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne(targetEntity = Supllier.class, fetch = FetchType.LAZY)
	@JoinColumn(name="supllier_id", referencedColumnName ="supllier_id")
	private Supllier supllier;
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
	public Supllier getSupllier() {
		return supllier;
	}
	public void setSupllier(Supllier supllier) {
		this.supllier = supllier;
	}
	
	
	

}
