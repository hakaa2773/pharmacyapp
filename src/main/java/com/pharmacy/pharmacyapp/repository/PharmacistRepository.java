package com.pharmacy.pharmacyapp.repository;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Pharmacist;

public interface PharmacistRepository extends CrudRepository<Pharmacist,Integer> {

}
