package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Customer;
import com.pharmacy.pharmacyapp.model.CustomerLogin;
import com.pharmacy.pharmacyapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer>customers = new ArrayList<Customer>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	@Override
	public Customer getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Customer> cust = Optional.ofNullable(customerRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Customer customer =cust.get();
		return customer;
	}

	@Override
	@Transactional
	public Optional<Customer> updateCustomer(Integer id, Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).map(e->{
			e.setName(customer.getName());
			e.setEmail(customer.getEmail());
			e.setPhone(customer.getPhone());
			return e;
		});
	}

	@Override
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
		
	}

	@Override
	public CustomerLogin checkCustomerLogin(String email) {
		// TODO Auto-generated method stub
		Optional <Customer> cust = Optional.ofNullable(customerRepository.findCustomerByEmail(email).orElseThrow(
				()-> new IllegalArgumentException("invalid email")));
		CustomerLogin customerLogin = cust.get().getCustomerLogin();
		return customerLogin;
	}

	@Override
	public Customer checkCustomeremail(String email) {
		// TODO Auto-generated method stub
		Optional <Customer> cust1 = Optional.ofNullable(customerRepository.findCustomerByEmail(email).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Customer customer =cust1.get();
		return customer;
	}
	

}
