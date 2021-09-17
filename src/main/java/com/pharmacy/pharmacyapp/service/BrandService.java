package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Brand;

public interface BrandService {

	void saveBrand(Brand brand);

	List<Brand> getallBrand();

	void updateBrand(Integer id, Brand brand);

	void deleteBrand(Integer id);

	

}
