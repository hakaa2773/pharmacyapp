package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Stock;
import com.pharmacy.pharmacyapp.repository.StockRepocitory;

@Service
public class StockServicImpl implements StockService{
	@Autowired
	private StockRepocitory stockRepocitory;

	@Override
	public void saveStock(Stock stock) {
		// TODO Auto-generated method stub
		stockRepocitory.save(stock);
		
	}

	@Override
	public List<Stock> getallStock() {
		// TODO Auto-generated method stub
		List<Stock>stocks =new ArrayList<Stock>();
		stockRepocitory.findAll().forEach(stocks::add);
		return stocks;
	}

	@Override
	public void updateStock(Integer id, Stock stock) {
		// TODO Auto-generated method stub
		stock.setId(id);
		stockRepocitory.save(stock);
		
	}

	@Override
	public void deleteStock(Integer id) {
		// TODO Auto-generated method stub
		stockRepocitory.deleteById(id);
		
	}

}
