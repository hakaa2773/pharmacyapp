package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.DTO.DrugDto;
import com.pharmacy.pharmacyapp.model.Drugs;
import com.pharmacy.pharmacyapp.service.DrugService;

@RestController
public class DrugController {
	@Autowired
	private DrugService drugService;
	@RequestMapping(method = RequestMethod.POST,value = "/savedrugs")
	public void saveDrugs(@RequestBody Drugs drugs) {
		drugService.saveDrug(drugs);
	}
	
	@RequestMapping("/getalldrugs")
	public List<Drugs> getAll(){
		return drugService.getallDrugs();		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatedrugs/{id}")
	public void updateDrugs(@PathVariable Integer id, @RequestBody Drugs drugs) {
		drugService.updateDrugs(id,drugs);		
	}
	@RequestMapping(method =RequestMethod.DELETE,value ="/deletedrugs/{id}" )
	public void deleteDrugs(@PathVariable Integer id) {
		drugService.deleteDrugs(id);		
	}
	
	@GetMapping("/getbynames")
	public List<DrugDto> getallnames(){
		return drugService.getallnames();
	}
	@RequestMapping(method = RequestMethod.GET,value ="/druggetbyid/{id}")
	public Drugs getDrugsById(@PathVariable Integer id) {
		return drugService.getById(id);
	}


}
