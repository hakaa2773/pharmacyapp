package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.model.Brand;

public interface BrandService {

	void saveBrand(Brand brand);

	List<Brand> getallBrand();
	
	Brand getById(Integer id);

	Optional<Brand> updateBrand(Integer id, Brand brand);

	void deleteBrand(Integer id);

	List<Brand> getAllByCatName();

	

}
