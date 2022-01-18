package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.model.Prescription;

public interface PrescriptionService {

	void savePrescription(Prescription prescription);

	Prescription getByprescriptionId(Integer id);
	
	Prescription getById(Integer id);

	Optional<Prescription>  updatePrescription(Integer id, Prescription prescription);

	void deleteprescription(Integer id);

	List<Prescription> getallPrescription();
}
