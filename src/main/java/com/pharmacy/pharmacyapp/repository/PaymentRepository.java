package com.pharmacy.pharmacyapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Payments;

public interface PaymentRepository extends CrudRepository<Payments, Integer> {

}
