package com.pharmacy.pharmacyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_drugs")
public class Drugs {
	@Id
	@Column(name ="drug_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="drug_name")
	private String name;
	@Column(name="drug_price")
	private Float price;
	@Column(name="brand_id")
	private Integer brandid;
	@Column(name="category_id")
	private Integer catid;
	@Column(name="rack_id")
	private Integer rackid;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getBrandid() {
		return brandid;
	}
	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}
	public Integer getCatid() {
		return catid;
	}
	public void setCatid(Integer catid) {
		this.catid = catid;
	}
	public Integer getRackid() {
		return rackid;
	}
	public void setRackid(Integer rackid) {
		this.rackid = rackid;
	}
	
	

}
