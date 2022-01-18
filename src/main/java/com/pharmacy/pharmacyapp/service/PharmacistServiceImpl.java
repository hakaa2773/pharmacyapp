package com.pharmacy.pharmacyapp.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Pharmacist;
import com.pharmacy.pharmacyapp.model.User;
import com.pharmacy.pharmacyapp.repository.PharmacistRepository;



@Service
public class PharmacistServiceImpl implements PharmacistService {
	
	@Autowired
	private PharmacistRepository pharmacistRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void savePharmacist(Pharmacist pmacist) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setPassword(bCryptPasswordEncoder.encode("123456"));
		user.setRole("ROLE_USER");
		user.setUserName(pmacist.getEmail());
		user.setStatus(true);
		pmacist.setUser(user);
		pharmacistRepository.save(pmacist);
	}

	@Override
	public List<Pharmacist> getAllPharmacist() {
		// TODO Auto-generated method stub
		List<Pharmacist> pmacistlist =new ArrayList<Pharmacist>();
		pharmacistRepository.findAll().forEach(pmacistlist::add);
		return pmacistlist;
		
	}

	@Override
	@Transactional
	public Optional<Pharmacist> updatePharmacist(Integer id, Pharmacist pharmacist) {
		// TODO Auto-generated method stub
		//pmacist.setId(id);
		//pharmacistRepository.save(pmacist);
		return pharmacistRepository.findById(id).map(e->{
			e.setName(pharmacist.getName());
			e.setEmail(pharmacist.getEmail());
			return e;			
		});
	}

	@Override
	public void deletePmacist(Integer id) {
		// TODO Auto-generated method stub
		pharmacistRepository.deleteById(id);
	}

	@Override
	public Pharmacist getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Pharmacist> pmacist = Optional.ofNullable(pharmacistRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("invalid Id")));
		Pharmacist pharmacist = pmacist.get();
		return pharmacist;
	}
	
}
