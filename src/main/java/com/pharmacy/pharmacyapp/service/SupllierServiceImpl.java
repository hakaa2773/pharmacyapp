package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.DTO.SupplierDto;
import com.pharmacy.pharmacyapp.model.Supllier;
import com.pharmacy.pharmacyapp.repository.SupllierRepository;

@Service
public class SupllierServiceImpl implements SupllierService {
	@Autowired
	private SupllierRepository supllierRepository;

	@Override
	public void saveSupllier(Supllier supllier) {
		// TODO Auto-generated method stub
		supllierRepository.save(supllier);
	}

	@Override
	public List<Supllier> getallSupllier() {
		// TODO Auto-generated method stub
		List<Supllier>suplliers =new ArrayList<Supllier>();
		supllierRepository.findAll().forEach(suplliers::add);
		return suplliers;
	}

	@Override
	@Transactional
	public Optional<Supllier> updateSupllier(Integer id, Supllier supllier) {
		// TODO Auto-generated method stub
		//supllier.setId(id);
		//supllierRepository.save(supllier);
		return supllierRepository.findById(id).map(e->{
			e.setName(supllier.getName());
			e.setEmail(supllier.getEmail());
			return e;
		});
		
	}

	@Override
	public void deleteSupllier(Integer id) {
		// TODO Auto-generated method stub
		supllierRepository.deleteById(id);
	}


	@Override
	public Supllier getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Supllier> sl = Optional.ofNullable(supllierRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Supllier supllier = sl.get();
		return supllier;
	}

	@Override
	public List<SupplierDto> getallBrandname() {
		// TODO Auto-generated method stub
		List<SupplierDto> supplierDtos = new ArrayList<SupplierDto>();
		supllierRepository.getbybrandname().forEach(supplierDtos::add);
		return supplierDtos;
	}
}



