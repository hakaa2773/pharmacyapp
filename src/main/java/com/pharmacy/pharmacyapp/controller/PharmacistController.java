package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.model.Pharmacist;
import com.pharmacy.pharmacyapp.service.PharmacistService;

@RestController
public class PharmacistController {
	@Autowired
	private PharmacistService pharmacistService;	
	@RequestMapping(method =RequestMethod.POST,value ="/savepharmacist")
	public void savePharmacist(@RequestBody Pharmacist pmacist) {
		pharmacistService.savePharmacist(pmacist);
	}
	
	@RequestMapping("/getallPharmacist")
	public List<Pharmacist> getAll(){
		return pharmacistService.getAllPharmacist();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatePharmacist/{id}")
	public void updatePharmacist(@PathVariable Integer id, @RequestBody Pharmacist Pmacist) {
		pharmacistService.updatePharmacist(id,Pmacist);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletePmacist/{id}")
	public void deletePmacist(@PathVariable Integer id) {
		pharmacistService.deletePmacist(id);
	}

}
