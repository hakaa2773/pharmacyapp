package com.pharmacy.pharmacyapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.PharmacyUserDetails;
import com.pharmacy.pharmacyapp.model.User;
import com.pharmacy.pharmacyapp.repository.UserRepository;

@Service
public class pharmacyUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findByuserName(username);
		user.orElseThrow(() -> new UsernameNotFoundException("User name is not exists :"+username));
		return user.map(PharmacyUserDetails::new).get();
	}

}
