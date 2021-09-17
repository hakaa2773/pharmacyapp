package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Supllier;

public interface SupllierService {

	void saveSupllier(Supllier supllier);

	List<Supllier> getallSupllier();

	void updateSupllier(Integer id, Supllier supllier);

	void deleteSupllier(Integer id);



}
