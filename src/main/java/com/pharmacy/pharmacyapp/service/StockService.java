package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.DTO.StockDto;
import com.pharmacy.pharmacyapp.model.Stock;

public interface StockService {

	void saveStock(Stock stock);

	List<Stock> getallStock();
	
	Stock getById(Integer id);

	Optional<Stock> updateStock(Integer id, Stock stock);

	void deleteStock(Integer id);

	List<StockDto> getallStockNames();




}
