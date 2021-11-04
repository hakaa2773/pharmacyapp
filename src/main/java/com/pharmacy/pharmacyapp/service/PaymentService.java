package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.DTO.PaymentsDto;
import com.pharmacy.pharmacyapp.model.Payments;

public interface PaymentService {

	void savePayments(Payments payments);

	List<Payments> getallPayment();
	
	Payments getById(Integer id);

	Optional<Payments> updatePayments(Integer id, Payments payments);

	void deletePayments(Integer id);

	List<PaymentsDto> getallPaymentnames();



}
