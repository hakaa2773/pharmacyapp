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
@Table(name="tbl_orders")
public class Orders {
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="order_date")
	private String odate;
	@Column(name="order_qty")
	private Integer oqty;
	@Column(name="order_price")
	private float oprice;
	@Column(name="order_total")
	private float ototal;
	@OneToOne(targetEntity = Invoice.class, fetch = FetchType.LAZY)
	@JoinColumn(name="invoice_id", referencedColumnName = "invoice_id")
	private Invoice invoice;
	@OneToOne(targetEntity = Drugs.class, fetch = FetchType.LAZY)
	@JoinColumn(name="drug_id" , referencedColumnName = "drug_id")
	private Drugs drugs;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
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
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Drugs getDrugs() {
		return drugs;
	}
	public void setDrugs(Drugs drugs) {
		this.drugs = drugs;
	}
	
	
	
	
}