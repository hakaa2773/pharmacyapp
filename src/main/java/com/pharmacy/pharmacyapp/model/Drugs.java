package com.pharmacy.pharmacyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	@OneToOne(targetEntity = Brand.class, fetch = FetchType.LAZY)
	@JoinColumn(name="brand_id",referencedColumnName = "brand_id")
	private Brand brand;
	@ManyToOne(targetEntity = Category.class, fetch = FetchType.LAZY)
	@JoinColumn(name="category_id",referencedColumnName = "category_id")
	private Category category;
	@OneToOne(targetEntity = Rack.class, fetch = FetchType.LAZY)
	@JoinColumn(name="rack_id", referencedColumnName = "rack_id")
	private Rack rack;
	
	
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
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Rack getRack() {
		return rack;
	}
	public void setRack(Rack rack) {
		this.rack = rack;
	}
	
	

	

	

}
