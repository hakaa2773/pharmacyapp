package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Invoice;

public interface InvoiceService {

	void saveInvoice(Invoice invoice);

	List<Invoice> getallInvoice();

	void updateInvoice(Integer id, Invoice invoice);

	void deleteInvoice(Integer id);

}
