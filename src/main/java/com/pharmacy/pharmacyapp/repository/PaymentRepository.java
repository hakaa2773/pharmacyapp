package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.PaymentsDto;
import com.pharmacy.pharmacyapp.model.Payments;

public interface PaymentRepository extends CrudRepository<Payments, Integer> {
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.PaymentsDto (p.id, p.total, s.id, s.name, s.email) FROM Payments p JOIN Supllier s ON p.supllier = s", nativeQuery = false)
	List<PaymentsDto>getallPaymentnames();

}
