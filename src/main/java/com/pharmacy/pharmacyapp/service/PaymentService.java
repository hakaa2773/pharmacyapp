package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Payments;

public interface PaymentService {

	void savePayments(Payments payments);

	List<Payments> getallPayment();

	void updatePayments(Integer id, Payments payments);

	void deletePayments(Integer id);



}
