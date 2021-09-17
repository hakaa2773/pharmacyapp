package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.model.Orders;
import com.pharmacy.pharmacyapp.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersRepository ordersRepository;

	@Override
	public void saveOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersRepository.save(orders);
		
	}

	@Override
	public List<Orders> getallOrders() {
		// TODO Auto-generated method stub
		List<Orders> orders =new ArrayList<Orders>();
		ordersRepository.findAll().forEach(orders::add);
		return orders;
	}

	@Override
	public void updateOrders(Integer id, Orders orders) {
		// TODO Auto-generated method stub
		orders.setId(id);
		ordersRepository.save(orders);
		
	}

	@Override
	public void deleteOrders(Integer id) {
		// TODO Auto-generated method stub
		ordersRepository.deleteById(id);
		
	}

}
