package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.DTO.RackDto;
import com.pharmacy.pharmacyapp.model.Rack;
import com.pharmacy.pharmacyapp.repository.RackRepository;
@Service
public class RackServiceImpl implements RackService {
	@Autowired
	private RackRepository rackRepository;

	@Override
	public void saveRack(Rack rack) {
		// TODO Auto-generated method stub
		rackRepository.save(rack);
		
	}

	@Override
	public List<Rack> getallRack() {
		// TODO Auto-generated method stub
		List<Rack> rack =new ArrayList<Rack>();
		rackRepository.findAll().forEach(rack::add);
		return rack;
	}

	@Override
	@Transactional
	public Optional<Rack> updateRack(Integer id, Rack rack) {
		// TODO Auto-generated method stub
		//rack.setId(id);
		//rackRepository.save(rack);
		return rackRepository.findById(id).map(e->{
			e.setRow(rack.getRow());
			return e;
		});
		
		
	}

	@Override
	public void deleteRack(Integer id) {
		// TODO Auto-generated method stub
		rackRepository.deleteById(id);
	}

	@Override
	public Rack getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Rack> rk = Optional.ofNullable(rackRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Rack rack = rk.get();
		return rack;
	}

	@Override
	public List<RackDto> getallRackNames() {
		// TODO Auto-generated method stub
		List<RackDto> rackDtos = new ArrayList<RackDto>();
		rackRepository.getallRackNames().forEach(rackDtos::add);
		return rackDtos;
	}

	




}
