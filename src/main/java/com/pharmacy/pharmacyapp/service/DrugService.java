package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.DTO.DrugDto;
import com.pharmacy.pharmacyapp.model.Drugs;

public interface DrugService {

	void saveDrug(Drugs drugs);

	List<Drugs> getallDrugs();
	
	Drugs getById(Integer id);

	Optional<Drugs> updateDrugs(Integer id, Drugs drugs);

	void deleteDrugs(Integer id);

	List<DrugDto> getallnames();





}
