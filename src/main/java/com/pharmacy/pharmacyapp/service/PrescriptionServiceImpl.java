package com.pharmacy.pharmacyapp.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pharmacy.pharmacyapp.model.Prescription;
import com.pharmacy.pharmacyapp.model.StockReturn;
import com.pharmacy.pharmacyapp.repository.PrescriptionRepository;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
	@Autowired
	private PrescriptionRepository prescriptionRepository;

	@Override
	public void savePrescription(Prescription prescription) {
		// TODO Auto-generated method stub
		prescriptionRepository.save(prescription);
		
	}

	@Override
	public Prescription getByprescriptionId(Integer id) {
		// TODO Auto-generated method stub
		Optional <Prescription> prOptional = Optional.ofNullable(prescriptionRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Prescription prescription =prOptional.get();
		return prescription;
	}

	@Override
	@Transactional
	public Optional<Prescription> updatePrescription(Integer id, Prescription prescription) {
		// TODO Auto-generated method stub
		return prescriptionRepository.findById(id).map(e->{
			e.setEmail(prescription.getEmail());
			e.setPhone(prescription.getPhone());
			e.setAddress(prescription.getAddress());
			e.setDrugs(prescription.getDrugs());
			e.setDescription(prescription.getDescription());
			return e;			
		});
		
	}

	@Override
	public void deleteprescription(Integer id) {
		// TODO Auto-generated method stub
		prescriptionRepository.deleteById(id);
		
	}

	@Override
	public Prescription getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Prescription> preOptional = Optional.ofNullable(prescriptionRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("invalid Id")));
		Prescription prescription = preOptional.get();
		return prescription;
	}

	@Override
	public List<Prescription> getallPrescription() {
		// TODO Auto-generated method stub
		List<Prescription>prescriptions =new ArrayList<Prescription>();
		prescriptionRepository.findAll().forEach(prescriptions::add);
		return prescriptions;
	}	
	
	

}
