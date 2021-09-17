package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.model.Returns;
import com.pharmacy.pharmacyapp.service.ReturnService;

@RestController
public class ReturnController {
	@Autowired
	private ReturnService returnService;
	@RequestMapping(method = RequestMethod.POST,value = "/savereturn")
	public void saveReturn(@RequestBody Returns returns) {
		returnService.saveReturn(returns);		
	}
	
	@RequestMapping("getallreturn")
	public List<Returns>getAll(){
		return returnService.getallReturn();
		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatereturn/{id}")
	public void updateReturn(@PathVariable Integer id, @RequestBody Returns returns) {
		returnService.updateReturn(id,returns);		
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value ="/deletereturns/{id}")
	public void deleteReturns(@PathVariable Integer id){
		returnService.deleteReturn(id);
	}
}
