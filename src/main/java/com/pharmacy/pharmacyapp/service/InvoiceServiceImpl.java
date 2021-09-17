package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Invoice;
import com.pharmacy.pharmacyapp.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	@Autowired
	private InvoiceRepository invoiceRepository;

	@Override
	public void saveInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		invoiceRepository.save(invoice);
		
	}

	@Override
	public List<Invoice> getallInvoice() {
		// TODO Auto-generated method stub
		List<Invoice>invoices = new ArrayList<Invoice>();
		invoiceRepository.findAll().forEach(invoices::add);
		return invoices;
	}

	@Override
	public void updateInvoice(Integer id, Invoice invoice) {
		// TODO Auto-generated method stub
		invoice.setId(id);
		invoiceRepository.save(invoice);
		
	}

	@Override
	public void deleteInvoice(Integer id) {
		// TODO Auto-generated method stub
		invoiceRepository.deleteById(id);
		
	}

}
