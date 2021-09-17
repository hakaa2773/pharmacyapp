package com.pharmacy.pharmacyapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Drugs;

public interface DrugRepository extends CrudRepository<Drugs, Integer> {

}
