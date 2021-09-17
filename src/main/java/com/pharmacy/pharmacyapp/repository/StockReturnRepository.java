package com.pharmacy.pharmacyapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.pharmacy.pharmacyapp.model.StockReturn;

public interface StockReturnRepository extends CrudRepository<StockReturn, Integer> {

}
