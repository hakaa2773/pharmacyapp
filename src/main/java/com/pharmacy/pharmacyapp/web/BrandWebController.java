package com.pharmacy.pharmacyapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pharmacy.pharmacyapp.service.BrandService;

@Controller
public class BrandWebController {
	@Autowired
	private BrandService brandService;
	
	@GetMapping("/viewbrand")
	public String getAllBrand(Model model) {
		model.addAttribute("brand", brandService.getAllByCatName());
		return"viewbrand";		
	}
	@GetMapping("/showbrand/{id}")
	public String showEditBrandForm(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("brand", brandService.getById(id));
		return"editbrand";
	}

}
