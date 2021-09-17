package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Payments;
import com.pharmacy.pharmacyapp.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public void savePayments(Payments payments) {
		// TODO Auto-generated method stub
		paymentRepository.save(payments);
		
	}

	@Override
	public List<Payments> getallPayment() {
		// TODO Auto-generated method stub
		List<Payments> payments =new ArrayList<Payments>();
		paymentRepository.findAll().forEach(payments::add);
		return payments;
	}

	@Override
	public void updatePayments(Integer id, Payments payments) {
		// TODO Auto-generated method stub
		payments.setId(id);
		paymentRepository.save(payments);
		
	}

	@Override
	public void deletePayments(Integer id) {
		// TODO Auto-generated method stub
		paymentRepository.deleteById(id);
		
	}

}
