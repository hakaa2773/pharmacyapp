package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.model.Customer;
import com.pharmacy.pharmacyapp.model.CustomerLogin;

public interface CustomerService {
	public void saveCustomer(Customer customer);

	public List<Customer> getAllCustomer();
	
	public Customer getById(Integer id);

	public Optional <Customer> updateCustomer(Integer id, Customer customer);

	public void deleteCustomer(Integer id);
	
	public CustomerLogin checkCustomerLogin(String email);

	public Customer checkCustomeremail(String email);

}
