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

import com.pharmacy.pharmacyapp.model.Supllier;
import com.pharmacy.pharmacyapp.service.BrandService;
import com.pharmacy.pharmacyapp.service.SupllierService;

@Controller
public class SupllierWebController {
	@Autowired
	private SupllierService supllierService; 
	
	@Autowired
	private BrandService brandService;
	
	@GetMapping("/viewsupplier")
	public String getAllSupllier(Model model) {
		model.addAttribute("supllier",supllierService.getallBrandname());
		return"viewsupplier";
	}
	
	
	@GetMapping("/showaddsupplier")
	public String addnewSupllier(Supllier supllier, Model model) {
		model.addAttribute("brand", brandService.getallBrand());
		return"newsupllier";
	}
	@PostMapping("/addsupllier")
	public String addNewSupllier(@Valid Supllier supllier, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "newsupllier";
		}
		supllierService.saveSupllier(supllier);
		return "redirect:/viewsupplier";
	}
	
	
	
	
	
	
	
	
	@GetMapping("/showsupplier/{id}")
	public String showEditsupllierForm(@PathVariable("id")Integer id,Model model) {
		model.addAttribute("supllier", supllierService.getById(id));
		return "editsupllier";
	}
	@PostMapping("/updateSupplier/{id}")
	public String updateSupllier(@PathVariable("id") Integer id, @Valid Supllier supllier, BindingResult result, Model model) {
		if(result.hasErrors()) {
			supllier.setId(id);
			model.addAttribute("supllier", supllier);
			return "editsupllier";
		}
		Optional<Supllier> suppllier = supllierService.updateSupllier(id, supllier);
		return "redirect:/viewsupplier";
	}
	
	
	
	@GetMapping("/deletesuppler/{id}")
	public String deleteSupllier(@PathVariable("id") Integer id, Model model) {
		supllierService.deleteSupllier(id);
		return "redirect:/viewsupplier";
		
	}

}
