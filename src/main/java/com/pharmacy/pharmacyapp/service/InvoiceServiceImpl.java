package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.DTO.InvoiceDto;
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
	public Optional<Invoice> updateInvoice(Integer id, Invoice invoice) {
		// TODO Auto-generated method stub
		//invoice.setId(id);
		//invoiceRepository.save(invoice);
		return invoiceRepository.findById(id).map(e->{
			e.setDate(invoice.getDate());
			e.setTotal(invoice.getTotal());
			return e;
		});
				
		
	}

	@Override
	public void deleteInvoice(Integer id) {
		// TODO Auto-generated method stub
		invoiceRepository.deleteById(id);
		
	}

	@Override
	public Invoice getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Invoice> in = Optional.ofNullable(invoiceRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Invoice invoice =in.get();
		return invoice;
	}

	@Override
	public List<InvoiceDto> getallInvoiceNames() {
		// TODO Auto-generated method stub
		List<InvoiceDto> invoiceDtos = new ArrayList<InvoiceDto>();
		invoiceRepository.getallInvoiceNames().forEach(invoiceDtos::add);
		return invoiceDtos;
	}

}
