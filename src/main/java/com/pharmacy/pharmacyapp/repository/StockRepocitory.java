package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.StockDto;
import com.pharmacy.pharmacyapp.model.Stock;

public interface StockRepocitory extends CrudRepository<Stock, Integer> {
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.StockDto(s.id, s.mfdate, s.expdate, s.sqty, s.srdate, d.id, d.name, d.price) FROM Stock s JOIN Drugs d ON s.drugs = d", nativeQuery = false)
	List<StockDto>getallStocknames();

}
