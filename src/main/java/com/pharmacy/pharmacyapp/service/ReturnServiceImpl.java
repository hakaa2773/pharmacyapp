package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Returns;
import com.pharmacy.pharmacyapp.repository.ReturnRepository;

@Service
public class ReturnServiceImpl implements ReturnService {
	@Autowired
	private ReturnRepository returnRepository;

	@Override
	public void saveReturn(Returns returns) {
		// TODO Auto-generated method stub
		returnRepository.save(returns);
		
	}

	@Override
	public List<Returns> getallReturn() {
		// TODO Auto-generated method stub
		List<Returns>returns =new ArrayList<Returns>();
		returnRepository.findAll().forEach(returns::add);
		return returns;
	}

	@Override
	public void updateReturn(Integer id, Returns returns) {
		// TODO Auto-generated method stub
		returns.setId(id);
		returnRepository.save(returns);
		
	}

	@Override
	public void deleteReturn(Integer id) {
		// TODO Auto-generated method stub
		returnRepository.deleteById(id);
		
	}

}
