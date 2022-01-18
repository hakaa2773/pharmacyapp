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
@Table(name="tbl_stock_return")
public class StockReturn {
 @Id
 @Column(name="stock_return_id")	
 @GeneratedValue (strategy = GenerationType.AUTO)
 private Integer id;
 @Column(name="stock_return_qty")
 private Integer srqty;
 @Column(name="stock_return_total")
 private float srtotal;
 @OneToOne(targetEntity =Stock.class, fetch = FetchType.LAZY)
 @JoinColumn(name="stock_id", referencedColumnName = "stock_id")
 private Stock stock; 
 @OneToOne(targetEntity =Supllier.class, fetch = FetchType.LAZY)
 @JoinColumn(name="supllier_id", referencedColumnName = "supllier_id")
 private Supllier supllier; 
 @OneToOne(targetEntity =Payments.class, fetch = FetchType.LAZY)
 @JoinColumn(name="payments_id", referencedColumnName = "payments_id")
 private Payments payments;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getSrqty() {
	return srqty;
}
public void setSrqty(Integer srqty) {
	this.srqty = srqty;
}
public float getSrtotal() {
	return srtotal;
}
public void setSrtotal(float srtotal) {
	this.srtotal = srtotal;
}
public Stock getStock() {
	return stock;
}
public void setStock(Stock stock) {
	this.stock = stock;
}
public Supllier getSupllier() {
	return supllier;
}
public void setSupllier(Supllier supllier) {
	this.supllier = supllier;
}
public Payments getPayments() {
	return payments;
}
public void setPayments(Payments payments) {
	this.payments = payments;
}

 
 
 
}
