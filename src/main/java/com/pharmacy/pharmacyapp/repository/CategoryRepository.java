package com.pharmacy.pharmacyapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
