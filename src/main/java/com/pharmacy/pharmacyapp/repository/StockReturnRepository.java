package com.pharmacy.pharmacyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.DTO.StockReturnDto;
import com.pharmacy.pharmacyapp.model.StockReturn;

public interface StockReturnRepository extends CrudRepository<StockReturn, Integer> {
	@Query(value = "SELECT new com.pharmacy.pharmacyapp.DTO.StockReturnDto(sr.id, sr.srqty, sr.srtotal, s.id, sp.id, sp.name, sp.email, p.id, p.total) FROM StockReturn sr "
			+ "JOIN Stock s ON sr.stock = s "
			+ "JOIN Supllier sp ON sr.supllier = sp "
			+ "JOIN Payments p ON sr.payments = p ",
			nativeQuery = false)
	List<StockReturnDto>getallStockReturnNames();
	

}
