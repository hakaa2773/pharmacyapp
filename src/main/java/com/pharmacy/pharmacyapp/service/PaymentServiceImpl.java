package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.DTO.PaymentsDto;
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
	@Transactional
	public Optional<Payments> updatePayments(Integer id, Payments payments) {
		// TODO Auto-generated method stub
		//payments.setId(id);
		//paymentRepository.save(payments);
		return paymentRepository.findById(id).map(e->{
			e.setTotal(payments.getTotal());
			return e;
		});
		
	}

	@Override
	public void deletePayments(Integer id) {
		// TODO Auto-generated method stub
		paymentRepository.deleteById(id);
		
	}

	@Override
	public Payments getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Payments> pt = Optional.ofNullable(paymentRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Payments payments = pt.get();
		return payments;
	}

	@Override
	public List<PaymentsDto> getallPaymentnames() {
		// TODO Auto-generated method stub
		List<PaymentsDto> paymentsDtos = new ArrayList<PaymentsDto>();
		paymentRepository.getallPaymentnames().forEach(paymentsDtos::add);
		return paymentsDtos;
	}

}
