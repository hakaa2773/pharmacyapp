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

import com.pharmacy.pharmacyapp.model.Brand;
import com.pharmacy.pharmacyapp.model.Prescription;
import com.pharmacy.pharmacyapp.service.PrescriptionService;

@Controller
public class PrescriptionWebController {
	@Autowired
	private PrescriptionService prescriptionService;
	
	@GetMapping("/viewPrescription")
	public String getAllPrescription(Model model) {
		model.addAttribute("prescription", prescriptionService.getallPrescription());
		return"viewprescription";		
	}
	

	@GetMapping("/showprescription/{id}")
	public String showEditPrescriptionForm(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("prescription", prescriptionService.getById(id));
		return"editprescription";
	}
	
	@PostMapping("/updateprescription/{id}")
	public String updatePrescription(@PathVariable("id")Integer id, @Valid Prescription prescription, BindingResult result, Model model) {
		if(result.hasErrors()) {
			prescription.setId(id);
			model.addAttribute("prescription", prescription);
			return"editprescription";
		}
		Optional<Prescription> pOptional = prescriptionService.updatePrescription(id, prescription);
		return "redirect:/viewPrescription";		
	}
	
	

}
