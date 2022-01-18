package com.pharmacy.pharmacyapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmacy.pharmacyapp.model.User;



public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByuserName(String userName);

}
