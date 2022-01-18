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

import com.pharmacy.pharmacyapp.model.Drugs;
import com.pharmacy.pharmacyapp.service.BrandService;
import com.pharmacy.pharmacyapp.service.CategoryService;
import com.pharmacy.pharmacyapp.service.DrugService;
import com.pharmacy.pharmacyapp.service.RackService;

@Controller
public class DrugsWebController {
	@Autowired
	private DrugService drugService;
	@Autowired
	private BrandService brandService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private RackService rackService;
	
	
	@GetMapping("/viewdrugs")
	public String getAllDrugs(Model model) {
		model.addAttribute("drugs", drugService.getallnames());
		return"viewdrugs";		
	}
	
	@GetMapping("/showadddrug")
	public String addnewDrug(Drugs drugs, Model model) {
		model.addAttribute("brand", brandService.getallBrand());
		model.addAttribute("category", categoryService.getallCategorys());
		model.addAttribute("rack", rackService.getallRack());
		return"newdrug";
	}
	@PostMapping("/addnewdrug")
	public String addnewDrug(@Valid Drugs drugs, BindingResult result, Model model){
		if(result.hasErrors()) {
			return "newdrug";
		}
		drugService.saveDrug(drugs);
		return "redirect:/viewdrugs";				
	}
	
	
	
	
	@GetMapping("/showdrug/{id}")
	public String showEditDrug(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("drugs", drugService.getById(id));
		return"editdrug";
	}
	@PostMapping("updatedrugs/{id}")
	public String updateDrugs(@PathVariable("id") Integer id, @Valid Drugs drugs,BindingResult result, Model model ) {
		if(result.hasErrors()) {
			drugs.setId(id);
			model.addAttribute("drugs", drugs);
			return"editdrug";
		}
		Optional<Drugs> dOptional = drugService.updateDrugs(id, drugs);
		return "redirect:/viewdrugs";
	} 
	
	
	
	
	@GetMapping("/deletedrug/{id}")
	public String deleteDrugs(@PathVariable("id") Integer id, Model model) {
		drugService.deleteDrugs(id);
		return "redirect:/viewdrugs";
	}

}
