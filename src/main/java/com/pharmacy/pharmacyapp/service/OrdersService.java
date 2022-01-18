package com.pharmacy.pharmacyapp.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.pharmacyapp.DTO.OrdersDto;
import com.pharmacy.pharmacyapp.model.Orders;

public interface OrdersService {

	void saveOrders(Orders orders);

	List<Orders> getallOrders();
	
	Orders getById(Integer id);

	Optional<Orders> updateOrders(Integer id, Orders orders);

	void deleteOrders(Integer id);

	List<OrdersDto> getallOrdernames();

}
