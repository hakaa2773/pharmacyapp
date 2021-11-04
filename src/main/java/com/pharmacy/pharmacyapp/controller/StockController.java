package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.DTO.StockDto;
import com.pharmacy.pharmacyapp.model.Stock;
import com.pharmacy.pharmacyapp.service.StockService;

@RestController
public class StockController {
	@Autowired
	private StockService stockService;
	@RequestMapping(method = RequestMethod.POST,value = "/savestock")
	private void saveStock(@RequestBody Stock stock) {
		stockService.saveStock(stock);
	}
	@RequestMapping("/getallstock")
	public List<Stock>getAll(){
		return stockService.getallStock();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatestock/{id}")
	public void updateStock(@PathVariable Integer id, @RequestBody Stock stock) {
		stockService.updateStock(id,stock);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletestock/{id}")
	public void deleteStick(@PathVariable Integer id) {
		stockService.deleteStock(id);		
	}
	@GetMapping("/getallstockname")
	public List<StockDto> getallStockNames(){
		return stockService.getallStockNames();
	}

}
