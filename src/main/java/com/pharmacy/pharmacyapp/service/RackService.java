package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.DTO.RackDto;
import com.pharmacy.pharmacyapp.model.Rack;

public interface RackService {

	public void saveRack(Rack rack);

	public List<Rack> getallRack();
	
	Rack getById(Integer id);

	Optional<Rack> updateRack(Integer id, Rack rack);

	public void deleteRack(Integer id);

	public List<RackDto> getallRackNames();

}
