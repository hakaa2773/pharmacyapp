package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void updateRack(Integer id, Rack rack) {
		// TODO Auto-generated method stub
		rack.setId(id);
		rackRepository.save(rack);
		
		
	}

	@Override
	public void deleteRack(Integer id) {
		// TODO Auto-generated method stub
		rackRepository.deleteById(id);
	}





}
