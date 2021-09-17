package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Stock;

public interface StockService {

	void saveStock(Stock stock);

	List<Stock> getallStock();

	void updateStock(Integer id, Stock stock);

	void deleteStock(Integer id);




}
