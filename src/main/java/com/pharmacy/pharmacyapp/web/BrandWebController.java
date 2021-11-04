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
import com.pharmacy.pharmacyapp.service.BrandService;
import com.pharmacy.pharmacyapp.service.CategoryService;

@Controller
public class BrandWebController {
	@Autowired
	private BrandService brandService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/viewbrand")
	public String getAllBrand(Model model) {
		model.addAttribute("brand", brandService.getallCatnum());
		return"viewbrand";	
	}
		
		
	@GetMapping("/showaddbrand")
	public String addnewBrand(Brand brand, Model model) {
		model.addAttribute("category", categoryService.getallCategorys());
		return"newbrand";
	}
	@PostMapping("/addnewbrand")
	public String addNewBrand(@Valid Brand brand, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newbrand";
		}
		brandService.saveBrand(brand);
		return "redirect:/viewbrand";			
	}
	
	
	
	@GetMapping("/showbrand/{id}")
	public String showEditBrandForm(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("brand", brandService.getById(id));
		return"editbrand";
	}
	
	@PostMapping("/updatebrand/{id}")
	public String updateBrand(@PathVariable("id")Integer id, @Valid Brand brand, BindingResult result, Model model) {
		if(result.hasErrors()) {
			brand.setId(id);
			model.addAttribute("brand", brand);
			return"editbrand";
		}
		Optional<Brand> bOptional = brandService.updateBrand(id, brand);
		return "redirect:/viewbrand";		
	}
	
	
	@GetMapping("/deletebrand/{id}")
	public String deleteBrand(@PathVariable("id") Integer id, Model model) {
		brandService.deleteBrand(id);
		return "redirect:/viewbrand";
	}

}
