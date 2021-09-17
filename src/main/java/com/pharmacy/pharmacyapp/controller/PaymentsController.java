package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.model.Payments;
import com.pharmacy.pharmacyapp.service.PaymentService;

@RestController
public class PaymentsController {
	@Autowired
	private PaymentService paymentService;
	@RequestMapping(method = RequestMethod.POST,value = ("/savepayments"))
	public void savePayments(@RequestBody Payments payments) {
		paymentService.savePayments(payments);		
	}
	
	@RequestMapping("/getallpayments")
	public List<Payments> getAll(){
		return paymentService.getallPayment();		
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updatepaymanets/{id}")
	public void upatepayments (@PathVariable Integer id, @RequestBody Payments payments) {
		paymentService.updatePayments(id,payments);		
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletepaymanets/{id}")
	public void deletePayments(@PathVariable Integer id) {
		paymentService.deletePayments(id);
		
	}

}
