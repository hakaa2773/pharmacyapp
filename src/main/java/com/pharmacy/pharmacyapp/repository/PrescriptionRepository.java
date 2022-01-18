package com.pharmacy.pharmacyapp.repository;


import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Prescription;

public interface PrescriptionRepository extends CrudRepository<Prescription, Integer>{

}
