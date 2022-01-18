package com.pharmacy.pharmacyapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.model.Customer;
import com.pharmacy.pharmacyapp.model.CustomerLogin;
import com.pharmacy.pharmacyapp.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	

	@RequestMapping(method =RequestMethod.POST,value ="/savecustomer")
	public void saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}
	@RequestMapping(method = RequestMethod.GET,value = "/getCustomerById/{id}")
	private Customer getCustomerById(@PathVariable Integer id) {
		return customerService.getById(id);
	}
	
	@RequestMapping("/getallcustomer")
	public List<Customer> getAll(){
		return customerService.getAllCustomer();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatecustomer/{id}")
	public void updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
		customerService.updateCustomer(id,customer);
	}
	@RequestMapping(method = RequestMethod.GET,value = "/checkcustomerlogin/{email}")
	public CustomerLogin getCustomerLogin(@PathVariable String email) {
		return customerService.checkCustomerLogin(email);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletecustomer/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		customerService.deleteCustomer(id);
	}
	@RequestMapping(method = RequestMethod.GET,value = "/checkcustomeremail/{email}")
	public Customer getCustomerEmail(@PathVariable String email) {
		return customerService.checkCustomeremail(email);
		
	}
	

}
