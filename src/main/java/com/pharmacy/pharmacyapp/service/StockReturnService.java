package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.DTO.StockReturnDto;
import com.pharmacy.pharmacyapp.model.StockReturn;

public interface StockReturnService {

	void saveStockReturn(StockReturn stockReturn);

	List<StockReturn> getallStockReturn();
	
	StockReturn getbyId(Integer id);

	Optional<StockReturn> updateStockReturn(Integer id, StockReturn stockReturn);

	void deleteStockReturn(Integer id);

	List<StockReturnDto> getallStockReturnNames();

}
