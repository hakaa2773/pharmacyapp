package com.pharmacy.pharmacyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 @Column(name="stock_id")
 private Integer stockid;
 @Column(name="supllier_id")
 private Integer supllierid;
 @Column(name="payments_id")
 private Integer paymentid;
 
 
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
public Integer getStockid() {
	return stockid;
}
public void setStockid(Integer stockid) {
	this.stockid = stockid;
}
public Integer getSupllierid() {
	return supllierid;
}
public void setSupllierid(Integer supllierid) {
	this.supllierid = supllierid;
}
public Integer getPaymentid() {
	return paymentid;
}
public void setPaymentid(Integer paymentid) {
	this.paymentid = paymentid;
}
 
 
 
}
