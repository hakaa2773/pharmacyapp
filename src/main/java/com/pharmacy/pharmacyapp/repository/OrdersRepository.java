package com.pharmacy.pharmacyapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.pharmacy.pharmacyapp.model.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {

}
