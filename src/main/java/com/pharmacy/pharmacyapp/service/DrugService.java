package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Drugs;

public interface DrugService {

	void saveDrug(Drugs drugs);

	List<Drugs> getallDrugs();

	void updateDrugs(Integer id, Drugs drugs);

	void deleteDrugs(Integer id);



}
