package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.DTO.StockDto;
import com.pharmacy.pharmacyapp.model.Invoice;
import com.pharmacy.pharmacyapp.model.Stock;

public interface InvoiceService {

	void saveInvoice(Invoice invoice);

	List<Invoice> getallInvoice();
	
	Invoice getById (Integer id);

	Optional<Invoice> updateInvoice(Integer id, Invoice invoice);

	void deleteInvoice(Integer id);

	List<StockDto> getallBrandnames();
	
	Optional<Stock> reduceStockQty(Integer id, int qty);
	

}
