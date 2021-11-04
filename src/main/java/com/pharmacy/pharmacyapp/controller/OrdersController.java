package com.pharmacy.pharmacyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.pharmacyapp.DTO.OrdersDto;
import com.pharmacy.pharmacyapp.model.Orders;
import com.pharmacy.pharmacyapp.service.OrdersService;

@RestController
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	@RequestMapping(method = RequestMethod.POST,value = "/saveorders")
	public void saveOrders(@RequestBody Orders orders) {
		ordersService.saveOrders(orders);
	}
	
	@RequestMapping("/getallorders")
	public List<Orders>getAll(){
		return ordersService.getallOrders();		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updateorders/{id}")
	public void updateOrders(@PathVariable Integer id, @RequestBody Orders orders) {
		ordersService.updateOrders(id,orders);		
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deleteorders/{id}")
	public void deleteOrders(@PathVariable Integer id) {
		ordersService.deleteOrders(id);		
	}
	@GetMapping("/getbyordernames")
	public List<OrdersDto> getallOrdernames(){
		return ordersService.getallOrdernames();
	}

}
