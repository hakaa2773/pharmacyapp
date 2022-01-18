package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.DTO.SupplierDto;
import com.pharmacy.pharmacyapp.model.Supllier;
import com.pharmacy.pharmacyapp.service.SupllierService;

@RestController
public class SupllierController {
	@Autowired
	private SupllierService supllierService;
	@RequestMapping(method = RequestMethod.POST,value = "/savesupllier")
	public void saveSupllier(@RequestBody Supllier supllier) {
		supllierService.saveSupllier(supllier);		
	}
	@RequestMapping("/getallsupllier")
	public List<Supllier>getAll(){
		return supllierService.getallSupllier();		
		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatesupllier/{id}")
	public void updateSupllier(@PathVariable Integer id, @RequestBody Supllier supllier) {
		supllierService.updateSupllier(id,supllier);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletesuplliar/{id}")
	public void deleteSupllier(@PathVariable Integer id) {
		supllierService.deleteSupllier(id);		
	}
	@RequestMapping("/getbybrandname")
	public List<SupplierDto> getallBrandname(){
		return supllierService.getallBrandname();
	}

}
