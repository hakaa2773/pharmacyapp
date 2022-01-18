package com.pharmacy.pharmacyapp.web;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharmacy.pharmacyapp.model.Payments;
import com.pharmacy.pharmacyapp.service.PaymentService;
import com.pharmacy.pharmacyapp.service.SupllierService;

@Controller
public class PaymentsWebController {
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private SupllierService supllierService;
	
	@GetMapping("/viewpayments")
	public String getAllPayments(Model model) {
		model.addAttribute("payments", paymentService.getallPaymentnames());
		return"viewpayments";
	}
	@GetMapping("/showpayments")
	public String addnewPayments(Payments payments,Model model) {
		model.addAttribute("supllier", supllierService.getallSupllier());
		return"newpayments";
	}
	@PostMapping("/addnewpayments")
	public String addnewPayments(@Valid Payments payments, BindingResult result, Model model) {
		if(result.hasErrors()) {
		return"newpayments";
	}
		paymentService.savePayments(payments);
		return "redirect:/viewpayments";	
	}	
	
	@GetMapping("/updatepayments/{id}")
	public String showEditPayments(@PathVariable("id")Integer id, Model model) {
		model.addAttribute("payments", paymentService.getById(id));
		return"editpayments";
	}
	@PostMapping("/updatepayments/{id}")
	public String updatePayments(@PathVariable("id")Integer id, @Valid Payments payments,BindingResult result,Model model) {
		if(result.hasErrors()) {
			payments.setId(id);
			model.addAttribute("payments", payments);
			return"newpayments";
		}
		Optional<Payments> pOptional = paymentService.updatePayments(id, payments);
				return "redirect:/viewpayments";
	}
	@GetMapping("/deletepayments/{id}")
	public String deletePayments(@PathVariable("id") Integer id, Model model) {
		paymentService.deletePayments(id);
		return "redirect:/viewpayments";
	}

}
