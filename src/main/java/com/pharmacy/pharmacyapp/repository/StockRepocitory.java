package com.pharmacy.pharmacyapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Stock;

public interface StockRepocitory extends CrudRepository<Stock, Integer> {

}
