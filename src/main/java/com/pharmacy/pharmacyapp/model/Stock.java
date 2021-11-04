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
@Table(name="tbl_stock")
public class Stock {
	@Id
	@Column(name="stock_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="stock_mf_date")
	private String mfdate;
	@Column(name="stock_exp_date")
	private String expdate;
	@Column(name="stock_qty")
	private Integer sqty;
	@Column(name="stock_rcv_date")
	private String srdate;
	@OneToOne(targetEntity =Drugs.class, fetch = FetchType.LAZY )
	@JoinColumn(name="drug_id", referencedColumnName = "drug_id")
	private Drugs drugs;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMfdate() {
		return mfdate;
	}
	public void setMfdate(String mfdate) {
		this.mfdate = mfdate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public Integer getSqty() {
		return sqty;
	}
	public void setSqty(Integer sqty) {
		this.sqty = sqty;
	}
	public String getSrdate() {
		return srdate;
	}
	public void setSrdate(String srdate) {
		this.srdate = srdate;
	}
	public Drugs getDrugs() {
		return drugs;
	}
	public void setDrugs(Drugs drugs) {
		this.drugs = drugs;
	}

	

	
	
	
	

}
