package com.pharmacy.pharmacyapp.repository;


import org.springframework.data.repository.CrudRepository;


import com.pharmacy.pharmacyapp.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {
	

}
