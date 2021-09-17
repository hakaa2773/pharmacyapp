package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.model.Pharmacist;

public interface PharmacistService {

	public void savePharmacist(Pharmacist pmacist);

	public List<Pharmacist> getAllPharmacist();
	
	public Pharmacist getById(Integer id);

	public Optional <Pharmacist> updatePharmacist(Integer id, Pharmacist pmacist);

	public void deletePmacist(Integer id);

}
