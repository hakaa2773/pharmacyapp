package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public Optional<Brand> updateBrand(Integer id, Brand brand) {
		// TODO Auto-generated method stub
		//brand.setId(id);
		//brandRepository.save(brand);
		return brandRepository.findById(id).map(e->{
			e.setName(brand.getName());
			e.setCatid(brand.getCatid());
			return e;
		});
	}

	@Override
	public void deleteBrand(Integer id) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(id);
		
	}

	@Override
	public Brand getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Brand> bd = Optional.ofNullable(brandRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Brand brand =bd.get();
		return brand;
	}

	@Override
	public List<Brand> getAllByCatName() {
		// TODO Auto-generated method stub
		List<Brand>brandlist = new ArrayList<>();
		brandRepository.findByCategoryID().forEach(brandlist::add);
		return brandlist;
	}

	
}
