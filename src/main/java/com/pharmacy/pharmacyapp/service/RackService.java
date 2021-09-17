package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Rack;

public interface RackService {

	public void saveRack(Rack rack);

	public List<Rack> getallRack();

	public void updateRack(Integer id, Rack rack);

	public void deleteRack(Integer id);

}
