package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Drugs;
import com.pharmacy.pharmacyapp.repository.DrugRepository;

@Service
public class DrugServiceImpl implements DrugService {
	@Autowired
	private DrugRepository drugRepository;

	@Override
	public void saveDrug(Drugs drugs) {
		// TODO Auto-generated method stub
		drugRepository.save(drugs);		
	}

	@Override
	public List<Drugs> getallDrugs() {
		// TODO Auto-generated method stub
		List<Drugs> drugs =new ArrayList<Drugs>();
		drugRepository.findAll().forEach(drugs::add);
		return drugs;
	}

	@Override
	public void updateDrugs(Integer id, Drugs drugs) {
		// TODO Auto-generated method stub
		drugs.setId(id);
		drugRepository.save(drugs);
		
	}

	@Override
	public void deleteDrugs(Integer id) {
		// TODO Auto-generated method stub
		drugRepository.deleteById(id);
		
	}

	

}
