package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.DTO.StockReturnDto;
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
	@Transactional
	public Optional<StockReturn> updateStockReturn(Integer id, StockReturn stockReturn) {
		// TODO Auto-generated method stub
		//stockReturn.setId(id);
		//stockReturnRepository.save(stockReturn);
		return stockReturnRepository.findById(id).map(e->{
			e.setSrqty(stockReturn.getSrqty());
			e.setSrtotal(stockReturn.getSrtotal());
			return e;
		});
		
	}

	@Override
	public void deleteStockReturn(Integer id) {
		// TODO Auto-generated method stub
		stockReturnRepository.deleteById(id);
		
	}

	@Override
	public StockReturn getbyId(Integer id) {
		// TODO Auto-generated method stub
		Optional <StockReturn> str = Optional.ofNullable(stockReturnRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		StockReturn stockReturn = str.get();
		return stockReturn;
	}

	@Override
	public List<StockReturnDto> getallStockReturnNames() {
		// TODO Auto-generated method stub
		List<StockReturnDto>stockReturnDtos = new ArrayList<StockReturnDto>();
		stockReturnRepository.getallStockReturnNames().forEach(stockReturnDtos::add);
		return stockReturnDtos;
	}

}
