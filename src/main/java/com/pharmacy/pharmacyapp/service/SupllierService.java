package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.DTO.SupplierDto;
import com.pharmacy.pharmacyapp.model.Supllier;

public interface SupllierService {

	void saveSupllier(Supllier supllier);

	List<Supllier> getallSupllier();
	
	public Supllier getById(Integer id);

	Optional<Supllier> updateSupllier(Integer id, Supllier supllier);

	void deleteSupllier(Integer id);

	List<SupplierDto> getallBrandname();
}
