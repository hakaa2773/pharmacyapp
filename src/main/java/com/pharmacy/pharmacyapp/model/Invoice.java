package com.pharmacy.pharmacyapp.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="tbl_invoice")
public class Invoice {
	@Id
	@Column(name="invoice_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="invoice_date")
	private String date;
	@Column(name="invoice_total")
	private float total;
	@OneToOne(targetEntity = Pharmacist.class, fetch = FetchType.LAZY)
	@JoinColumn(name="pharmacist_id", referencedColumnName = "pharmacist_id")
	private Pharmacist pharmacist;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Pharmacist getPharmacist() {
		return pharmacist;
	}
	public void setPharmacist(Pharmacist pharmacist) {
		this.pharmacist = pharmacist;
	}
	
	

}
