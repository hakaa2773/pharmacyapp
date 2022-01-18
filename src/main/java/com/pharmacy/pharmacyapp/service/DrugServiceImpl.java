package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.DTO.DrugDto;
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
	@Transactional
	public Optional<Drugs> updateDrugs(Integer id, Drugs drugs) {
		// TODO Auto-generated method stub
		//drugs.setId(id);
		//drugRepository.save(drugs);
		return drugRepository.findById(id).map(e->{
			e.setName(drugs.getName());
			e.setPrice(drugs.getPrice());
			return e;
		});
		
	}

	@Override
	public void deleteDrugs(Integer id) {
		// TODO Auto-generated method stub
		drugRepository.deleteById(id);
		
	}

	@Override	
	public Drugs getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Drugs> dg = Optional.ofNullable(drugRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Drugs drugs = dg.get();		
		return drugs;
	}

	@Override
	public List<DrugDto> getallnames() {
		// TODO Auto-generated method stub
		List<DrugDto>drugDtos = new ArrayList<DrugDto>();
		drugRepository.getbynames().forEach(drugDtos::add);
		return drugDtos;
	}

}
