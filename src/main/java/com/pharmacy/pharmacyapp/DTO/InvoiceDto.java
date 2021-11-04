package com.pharmacy.pharmacyapp.DTO;

public class InvoiceDto {
	private Integer invoice_id;
	private String  invoice_date;
	private Float invoice_total;
	private Integer pharmacist_id;
	private String pharmacist_name;
	private String pharmacist_email;
	private String pharmacist_password;
	public InvoiceDto(Integer invoice_id, String invoice_date, Float invoice_total, Integer pharmacist_id,
			String pharmacist_name, String pharmacist_email, String pharmacist_password) {
		super();
		this.invoice_id = invoice_id;
		this.invoice_date = invoice_date;
		this.invoice_total = invoice_total;
		this.pharmacist_id = pharmacist_id;
		this.pharmacist_name = pharmacist_name;
		this.pharmacist_email = pharmacist_email;
		this.pharmacist_password = pharmacist_password;
	}
	public Integer getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(Integer invoice_id) {
		this.invoice_id = invoice_id;
	}
	public String getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	public Float getInvoice_total() {
		return invoice_total;
	}
	public void setInvoice_total(Float invoice_total) {
		this.invoice_total = invoice_total;
	}
	public Integer getPharmacist_id() {
		return pharmacist_id;
	}
	public void setPharmacist_id(Integer pharmacist_id) {
		this.pharmacist_id = pharmacist_id;
	}
	public String getPharmacist_name() {
		return pharmacist_name;
	}
	public void setPharmacist_name(String pharmacist_name) {
		this.pharmacist_name = pharmacist_name;
	}
	public String getPharmacist_email() {
		return pharmacist_email;
	}
	public void setPharmacist_email(String pharmacist_email) {
		this.pharmacist_email = pharmacist_email;
	}
	public String getPharmacist_password() {
		return pharmacist_password;
	}
	public void setPharmacist_password(String pharmacist_password) {
		this.pharmacist_password = pharmacist_password;
	}
	
	

}
