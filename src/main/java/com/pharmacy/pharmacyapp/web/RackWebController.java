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

import com.pharmacy.pharmacyapp.model.Rack;
import com.pharmacy.pharmacyapp.service.BrandService;
import com.pharmacy.pharmacyapp.service.CategoryService;
import com.pharmacy.pharmacyapp.service.RackService;

@Controller
public class RackWebController {
	@Autowired
	private RackService rackService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private BrandService brandService;
	
	@GetMapping("/viewrack")
	public String getAllRack(Model model){
		model.addAttribute("rack", rackService.getallRackNames());
		return"viewrack";
	}
	
	@GetMapping("/showaddrack")
	public String addnewRack(Rack rack, Model model) {
		model.addAttribute("category", categoryService.getallCategorys());
		model.addAttribute("brand", brandService.getallBrand());
		return"newrack";
		
	}
	@PostMapping("/addnewrack")
	public String addnewRack(@Valid Rack rack, BindingResult result, Model model) {
		if(result.hasErrors()) {
		return"newrack";
		}
		rackService.saveRack(rack);
		return "redirect:/viewrack";
	}
	
	@GetMapping("/showrack/{id}")
	public String addnewRack(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("rack", rackService.getById(id));
		return"editrack";
	}
	@PostMapping("/updaterack/{id}")
	public String updateRack(@PathVariable("id")Integer id, @Valid Rack rack, BindingResult result, Model model) {
		if(result.hasErrors()) {
			rack.setId(id);
			model.addAttribute("rack", rack);
			return"editrack";
		}
		Optional<Rack>rOptional = rackService.updateRack(id, rack);
		return "redirect:/viewrack";		
	}
	@GetMapping("/deleterack/{id}")
	public String deleteRack(@PathVariable ("id") Integer id, Model model) {
		rackService.deleteRack(id);
		return "redirect:/viewrack";		
	}
	

}
