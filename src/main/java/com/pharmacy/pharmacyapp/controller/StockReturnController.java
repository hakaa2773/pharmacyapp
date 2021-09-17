package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.model.StockReturn;
import com.pharmacy.pharmacyapp.service.StockReturnService;

@RestController
public class StockReturnController {
	@Autowired
	public StockReturnService stockReturnService;
	@RequestMapping(method = RequestMethod.POST,value = "/savestockreturn")
	public void saveStockReturn(@RequestBody StockReturn stockReturn) {
		stockReturnService.saveStockReturn(stockReturn);		
	}
	@RequestMapping("/getallstockreturn")
	public List<StockReturn> getall(){
		return stockReturnService.getallStockReturn();		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatestockreturn/{id}")
	public void updateStockReturn(@PathVariable Integer id, @RequestBody StockReturn stockReturn) {
		stockReturnService.updateStockReturn(id,stockReturn);		
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletestockreturn/{id}")
	public void deleteStockReturn(@PathVariable Integer id) {
		stockReturnService.deleteStockReturn(id);
		
	}

}
