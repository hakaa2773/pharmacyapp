package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.InvoiceDto;
import com.pharmacy.pharmacyapp.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.InvoiceDto(i.id, i.date, i.total, p.id, p.name, p.email, p.password) FROM Invoice i "
			+ "JOIN Pharmacist p ON i.pharmacist = p",
			nativeQuery = false)
	List<InvoiceDto> getallInvoiceNames();

}
