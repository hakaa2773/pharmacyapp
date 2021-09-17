package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.StockReturn;

public interface StockReturnService {

	void saveStockReturn(StockReturn stockReturn);

	List<StockReturn> getallStockReturn();

	void updateStockReturn(Integer id, StockReturn stockReturn);

	void deleteStockReturn(Integer id);

}
