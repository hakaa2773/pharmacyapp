package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void updateSupllier(Integer id, Supllier supllier) {
		// TODO Auto-generated method stub
		supllier.setId(id);
		supllierRepository.save(supllier);
		
	}

	@Override
	public void deleteSupllier(Integer id) {
		// TODO Auto-generated method stub
		supllierRepository.deleteById(id);
	}
}



