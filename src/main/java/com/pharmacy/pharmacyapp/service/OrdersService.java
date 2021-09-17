package com.pharmacy.pharmacyapp.service;

import java.util.List;

import com.pharmacy.pharmacyapp.model.Orders;

public interface OrdersService {

	void saveOrders(Orders orders);

	List<Orders> getallOrders();

	void updateOrders(Integer id, Orders orders);

	void deleteOrders(Integer id);

}
