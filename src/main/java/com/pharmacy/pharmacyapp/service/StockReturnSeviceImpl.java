package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.StockReturn;
import com.pharmacy.pharmacyapp.repository.StockReturnRepository;

@Service
public class StockReturnSeviceImpl implements StockReturnService {
	@Autowired
	private StockReturnRepository stockReturnRepository;

	@Override
	public void saveStockReturn(StockReturn stockReturn) {
		// TODO Auto-generated method stub
		stockReturnRepository.save(stockReturn);
		
	}

	@Override
	public List<StockReturn> getallStockReturn() {
		// TODO Auto-generated method stub
		List<StockReturn>stockReturns =new ArrayList<StockReturn>();
		stockReturnRepository.findAll().forEach(stockReturns::add);
		return stockReturns;
	}

	@Override
	public void updateStockReturn(Integer id, StockReturn stockReturn) {
		// TODO Auto-generated method stub
		stockReturn.setId(id);
		stockReturnRepository.save(stockReturn);
		
	}

	@Override
	public void deleteStockReturn(Integer id) {
		// TODO Auto-generated method stub
		stockReturnRepository.deleteById(id);
		
	}

}
