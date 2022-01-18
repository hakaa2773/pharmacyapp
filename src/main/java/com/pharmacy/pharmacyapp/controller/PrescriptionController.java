package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.model.Brand;
import com.pharmacy.pharmacyapp.model.Pharmacist;
import com.pharmacy.pharmacyapp.model.Prescription;
import com.pharmacy.pharmacyapp.service.PrescriptionService;

@RestController
public class PrescriptionController {
	@Autowired
	private PrescriptionService prescriptionService;
	
	@RequestMapping(method =RequestMethod.POST,value ="/saveprescription")
	public void savePrescription(@RequestBody Prescription prescription) {
		prescriptionService.savePrescription(prescription);
	}
	@RequestMapping(method = RequestMethod.GET,value = "/getprescriptionById/{id}")
	private Prescription getPrescriptionById(@PathVariable Integer id) {
		return prescriptionService.getByprescriptionId(id);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updateprescription/{id}")
	public void updateprescription(@PathVariable Integer id, @RequestBody Prescription prescription) {
		prescriptionService.updatePrescription(id,prescription);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deleteprescription/{id}")
	public void deletePrescription(@PathVariable Integer id) {
		prescriptionService.deleteprescription(id);
	}
	
	@RequestMapping("/getallprescription")
	public List <Prescription> getAll(){
		return prescriptionService.getallPrescription();
	}

}
