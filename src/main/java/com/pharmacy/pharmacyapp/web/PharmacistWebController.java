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
import com.pharmacy.pharmacyapp.model.Pharmacist;
import com.pharmacy.pharmacyapp.service.PharmacistService;

@Controller
public class PharmacistWebController {
	@Autowired
	private PharmacistService pharmacistService;
	
	@GetMapping("/")
	public String  showIndex() {
		return "index";
	}
	
	@GetMapping("/viewphamacist")
	public String getAllPharmacist(Model model) {
		model.addAttribute("phamacist",pharmacistService.getAllPharmacist());
		return "viewpharmacist";		
	}
	
	
	
	@GetMapping("/showaddpharmacist")
	public String ShowAddPharmacistForm(Pharmacist pharmacist) {
		return "newpharmacist";
	}
	@PostMapping("/addnewpharmacist")
	public String addNewPharmacist(@Valid Pharmacist pharmacist, BindingResult result, Model model){
		if(result.hasErrors()) {
			return "newpharmacist";
		}
		pharmacistService.savePharmacist(pharmacist);
		return "redirect:/viewphamacist";
	}
	
	
	
	
	
	@GetMapping("/showpharmacist/{id}")
	public String ShowEditPharmacistForm(@PathVariable("id") Integer id,Model model){
		model.addAttribute("pharmacist",pharmacistService.getById(id));
		return "editpharmacist";
	}
	
	@PostMapping("/updatePharmacist/{id}")
	public String updatePharmacist(@PathVariable("id") Integer id, @Valid Pharmacist pharmacist, BindingResult result, Model model) {
		if(result.hasErrors()) {
			pharmacist.setId(id);
			model.addAttribute("pharmacist",pharmacist);
			return "editpharmacist";
		}
		Optional<Pharmacist> pharmacist1 =pharmacistService.updatePharmacist(id, pharmacist);
		return "redirect:/viewphamacist";		
	}
	
	@GetMapping("/deletepharmacist/{id}")
	public String deletePharmacist(@PathVariable("id") Integer id, Model model) {
		pharmacistService.deletePmacist(id);
		return "redirect:/viewphamacist";
	}

}
