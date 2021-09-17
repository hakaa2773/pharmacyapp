package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Brand;
import com.pharmacy.pharmacyapp.repository.BrandRepository;

@Service
public class brandServiceImpl implements BrandService {
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public void saveBrand(Brand brand) {
		// TODO Auto-generated method stub
		brandRepository.save(brand);
		
	}

	@Override
	public List<Brand> getallBrand() {
		// TODO Auto-generated method stub
		List<Brand>brandlist =new ArrayList<Brand>();
		brandRepository.findAll().forEach(brandlist::add);
		return brandlist;
	}

	@Override
	public void updateBrand(Integer id, Brand brand) {
		// TODO Auto-generated method stub
		brand.setId(id);
		brandRepository.save(brand);
	}

	@Override
	public void deleteBrand(Integer id) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(id);
		
	}
}
