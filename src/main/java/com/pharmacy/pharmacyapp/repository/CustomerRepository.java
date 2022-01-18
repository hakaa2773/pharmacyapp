package com.pharmacy.pharmacyapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	Optional<Customer> findCustomerByEmail(String email); 

}
