package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.DTO.StockDto;
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
	@Transactional
	public Optional<Stock> updateStock(Integer id, Stock stock) {
		// TODO Auto-generated method stub
		//stock.setId(id);
		//stockRepocitory.save(stock);
		return stockRepocitory.findById(id).map(e->{
			e.setMfdate(stock.getMfdate());
			e.setExpdate(stock.getExpdate());
			e.setSqty(stock.getSqty());
			e.setSrdate(stock.getSrdate());
			return e;
		});
		
	}

	@Override
	public void deleteStock(Integer id) {
		// TODO Auto-generated method stub
		stockRepocitory.deleteById(id);
		
	}

	@Override
	public Stock getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Stock> st = Optional.ofNullable(stockRepocitory.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Stock stock = st.get();
		return stock;
	}

	@Override
	public List<StockDto> getallStockNames() {
		// TODO Auto-generated method stub
		List<StockDto> stockDtos = new ArrayList<StockDto>();
		stockRepocitory.getallStocknames().forEach(stockDtos::add);
		return stockDtos;
	}

}
