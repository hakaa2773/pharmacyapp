package com.pharmacy.pharmacyapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.pharmacyapp.DTO.OrdersDto;
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
	@Transactional
	public Optional<Orders> updateOrders(Integer id, Orders orders) {
		// TODO Auto-generated method stub
		//orders.setId(id);
		//ordersRepository.save(orders);
		return ordersRepository.findById(id).map(e->{
			e.setOdate(orders.getOdate());
			e.setOqty(orders.getOqty());
			e.setOprice(orders.getOprice());
			e.setOtotal(orders.getOtotal());
			return e;
		});
		
	}

	@Override
	public void deleteOrders(Integer id) {
		// TODO Auto-generated method stub
		ordersRepository.deleteById(id);
		
	}

	@Override
	public Orders getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Orders> od = Optional.ofNullable(ordersRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Orders orders = od.get();
		return orders;
	}

	@Override
	public List<OrdersDto> getallOrdernames() {
		// TODO Auto-generated method stub
		List<OrdersDto> ordersDtos = new ArrayList<OrdersDto>();
		ordersRepository.getallOrdernames().forEach(ordersDtos::add);
		return ordersDtos;
	}

}
